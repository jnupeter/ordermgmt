import {Component} from '@angular/core';
import {RouteConfig, ROUTER_DIRECTIVES} from '@angular/router-deprecated/';
import {CustomerListComponent} from './customer-list.component';

@Component({
  selector: 'customer',
  template: `<router-outlet></router-outlet>`,
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
  {path: '/', name: 'CustomerList', component: CustomerListComponent, useAsDefault: true}
])
export class CustomerComponent {}
