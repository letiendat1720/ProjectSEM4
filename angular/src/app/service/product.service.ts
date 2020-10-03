import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ProductService {

  constructor( private http: HttpClient) { }
  baseUrl() {
    return 'http://localhost:21022';
  }
  changeUrl() {
    return 'Product';
}
  rootUrl() {
    return this.baseUrl() + '/api/services/app/' + this.changeUrl();
  }

  getProduct(): Observable<any> {
    return  this.http.get( this.rootUrl() + '/GetProducts');
  }
  getProductID(id: any): Observable<any> {
    return this.http.get(this.rootUrl() + '/GetById?id=' + id );
  } 
}
