import {Component} from '@angular/core';
import {ROUTER_DIRECTIVES, RouteConfig} from '@angular/router-deprecated';
import {ProductListComponent} from './product-list.component';

@Component({
  selector: 'product',
  template: '<router-outlet></router-outlet>',
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
  {path : '/', name: 'ProductList', component: ProductListComponent, useAsDefault: true}
])
export class ProductComponent {

}
