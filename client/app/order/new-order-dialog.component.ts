import {Component, OnInit} from '@angular/core';
import {Customer} from '../customer/customer';
import {CustomerService} from '../customer/customer.service';

@Component({
  selector: 'new-order-dialog',
  providers: [CustomerService],
  template:`
  <!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
New Order
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
<div class="modal-dialog" role="document">
  <div class="modal-content">
    <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      <h4 class="modal-title" id="myModalLabel">New Order</h4>
    </div>
    <div class="modal-body">
        <form class="form-horizontal">
           <div class="form-group">
                <label>Customer</label>
                <select class="form-control">
                    <option *ngFor='let c of customers'>{{c.last_name}}{{c.first_name}}</option>
                </select>
           </div>
        </form>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
      <button type="button" class="btn btn-primary">Create</button>
    </div>
  </div>
</div>
</div>
  `
})
export class NewOrderDialogComponent implements OnInit {
  customers: Customer[];
  constructor(private _customerService: CustomerService) {}
  ngOnInit() {
    this._customerService.getAllCustomers().subscribe(
      data => this.customers = data
    );
  }
}
