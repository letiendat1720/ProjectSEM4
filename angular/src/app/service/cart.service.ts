import { Injectable } from '@angular/core';
import { param } from 'jquery';
import { Observable, ReplaySubject } from 'rxjs';
import * as _ from 'lodash';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})

export class CartService {
  constructor( private router : Router) {
  }
  listItemAddToCart= [];
  count: any = localStorage.getItem('dataCount');
    // tslint:disable-next-line: typedef
    addItem(data) {
      const item = this.listItemAddToCart.find(res =>  res.name === data.name)
      if(item) {
      data.total +=1;
      }
      const dataCartLocal = localStorage.getItem('dataCount');
      // tslint:disable-next-line: radix
      if(parseInt(dataCartLocal) > 0) {
          this.listItemAddToCart = JSON.parse(localStorage.getItem('listItemAddToCart'))
          this.listItemAddToCart.push(data);
      } else {
        this.listItemAddToCart.push(data);
      }
      localStorage.setItem('listItemAddToCart', JSON.stringify(this.listItemAddToCart));

      if(this.router.url === '/cart') {
        this.count--;
      }
      this.count++;
      localStorage.setItem('dataCount', JSON.stringify(this.count));
    }

  }
