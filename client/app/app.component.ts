import { Component }  from '@angular/core';
import { RouteConfig, Router, ROUTER_DIRECTIVES } from '@angular/router-deprecated';
import { Title } from '@angular/platform-browser';

import {HomeComponent} from './home/home.component';
import { CustomerComponent } from './customer/customer.component';
import { ProductComponent } from './product/product.component';
import { ShipmentComponent } from './shipment/shipment.component';
import { SettingComponent } from './setting/settings.component';
import { OrderComponent }  from './order/order.component';

@Component({
  selector: 'my-app',
  template: `
  <nav class="navbar navbar-default">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" [routerLink]="['Home']" (click)="setTitle('Home')">OrderMgmt</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li [class.active]="isCurrentActive(['Orders'])">
               <a [routerLink]="['Orders']" (click)="setTitle('Orders')">Orders</a>
            </li>
            <li [class.active]="isCurrentActive(['Customers'])">
               <a [routerLink]="['Customers']" (click)="setTitle('Customers')">Customers</a>
            </li>
            <li [class.active]="isCurrentActive(['Products'])">
               <a [routerLink]="['Products']" (click)="setTitle('Products')">Products</a>
            </li>
            <li [class.active]="isCurrentActive(['Shipments'])">
               <a [routerLink]="['Shipments']" (click)="setTitle('Shipments')">Shipments</a>
            </li>
            <li [class.active]="isCurrentActive(['Setting'])">
               <a [routerLink]="['Setting']" (click)="setTitle('Setting')">Setting<i class="fa fa-cog" aria-hidden="true"></i></a>
            </li>
          </ul>

        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>
         <div class="container">
             <router-outlet></router-outlet>
         </div>
  `,
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
  {path : '/', name : 'Home', component : HomeComponent},
  {path : '/orders/...', name: 'Orders', component: OrderComponent},
  {path : '/customers/...', name: 'Customers', component: CustomerComponent},
  {path : '/products/...', name: 'Products', component: ProductComponent},
  {path : '/shipments/...', name: 'Shipments', component: ShipmentComponent},
  {path : '/setting', name: 'Setting', component: SettingComponent}
])
export class AppComponent {
  constructor(private _title: Title, private _router: Router){}

  setTitle(title: string) {
    this._title.setTitle(title);
  }

  isCurrentActive(route: any) {
    var instruction = this._router.generate(route);
    return this._router.isRouteActive(instruction);
  }
}
