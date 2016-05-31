import {Component} from '@angular/core';
import {Shipment} from './shipment';

@Component({
  selector: 'shipment-list',
  template: `
     <h2>Shipments</h2>
     <i [hidden]="!isLoading" class="fa fa-spinner fa-spin fa-3x"></i>
     <div [hidden]="isLoading">
       <ul class="list-group">
          <li *ngFor="let s of shipments" class="list-group-item">
             <span class="badge">{{s.status}}</span>
             <h4 class="list-group-item-heading">{{s.receiptName}}</h4>
             <p class="list-group-item-text">{{s.receiptAddress}}
             </p>
          </li>
       </ul>
     </div>
  `
})
export class ShipmentListComponent {
  isLoading: boolean = true;
  shipments: Shipment[];

  ngOnInit() {
    
  }
}
