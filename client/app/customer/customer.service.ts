import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {Customer} from './customer';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class CustomerService {

  customerServiceUrl : string = 'http://localhost:8001/customers';
  constructor(private _http: Http) {}

  getAllCustomers() : Observable<Customer[]> {
    return this._http.get(this.customerServiceUrl)
               .map(res => res.json());
  }
}
