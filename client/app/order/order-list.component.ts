import { Component } from '@angular/core';
import { NewOrderDialogComponent } from './new-order-dialog.component';

@Component({
  selector: 'order-list',
  template: `
    <h2>Orders</h2>
    <new-order-dialog></new-order-dialog>
  `,
  directives: [NewOrderDialogComponent]
})
export class OrderListComponent {

}
