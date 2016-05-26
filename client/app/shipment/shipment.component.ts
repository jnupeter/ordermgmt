import {Component} from '@angular/core';
import {ROUTER_DIRECTIVES, RouteConfig} from '@angular/router-deprecated';
import {ShipmentListComponent} from './shipment-list.component';

@Component({
  selector: 'shipment',
  template: '<router-outlet></router-outlet>',
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
  {path : '/', name: 'ShipmentList', component: ShipmentListComponent, useAsDefault: true}
])
export class ShipmentComponent {

}
