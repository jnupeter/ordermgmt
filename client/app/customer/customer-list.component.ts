import {Component, OnInit} from '@angular/core';
import {Customer} from './customer';
import {CustomerService} from './customer.service';
import {PAGINATION_DIRECTIVES} from 'ng2-bootstrap/ng2-bootstrap';

@Component({
  selector: 'customer-list',
  template:`
     <pagination [totalItems]="totalItems" [itemsPerPage]="itemsPerPage" [(ngModel)]="currentPage" (pageChanged)="onPageChanged($event)"></pagination>
     <table class="table table-boarder">
         <tbody>
            <tr *ngFor="let c of customersOnCurrentPage">
                <td>{{c.id}}</td>
                <td>{{c.last_name}}{{c.first_name}}</td>
                <td>{{c.email}}</td>
                <td>{{c.idNumber}}</td>
            </tr>
         </tbody>
     </table>
  `,
  directives:[PAGINATION_DIRECTIVES],
  providers: [CustomerService]
})
export class CustomerListComponent implements OnInit {
  totalItems : number;
  currentPage : number = 1;
  itemsPerPage : number = 10;
  customers : Customer[];
  customersOnCurrentPage : Customer[];

  constructor(private _customerService : CustomerService){}

  ngOnInit() {
     this._customerService.getAllCustomers().subscribe(
        res => {
                this.customers = res;
                this.totalItems = this.customers.length;
                this.customersOnCurrentPage = _.take(this.customers, this.itemsPerPage);
              },
        null
     );
  }

  onPageChanged(event : any) {
    var newPageNumber = event.page;
    var startIndex = (newPageNumber - 1) * this.itemsPerPage;
    this.customersOnCurrentPage = _.take(_.rest(this.customers, startIndex), this.itemsPerPage);
  }
}
