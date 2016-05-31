import {Component} from '@angular/core';
import {RouteConfig, ROUTER_DIRECTIVES} from '@angular/router-deprecated';
import {OrderListComponent} from './order-list.component';

@Component({
  selector: 'order',
  template: '<router-outlet></router-outlet>',
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
  {path : '/', name: 'OrderList', component: OrderListComponent, useAsDefault: true}
])
export class OrderComponent {

}
