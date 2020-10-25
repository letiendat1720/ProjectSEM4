import { Injectable } from '@angular/core';
import { param } from 'jquery';
import { Observable, ReplaySubject } from 'rxjs';
import * as _ from 'lodash';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})

export class CartService {
  constructor(private router: Router) {
  }
  listItemAddToCart = [];
  item: any;
  count: any = localStorage.getItem('dataCount');

  // tslint:disable-next-line: typedef
  addItem(data) {
    this.listItemAddToCart = JSON.parse(localStorage.getItem('listItemAddToCart'));
    if (this.listItemAddToCart) {
      this.item = this.listItemAddToCart.find(res => res.name === data.name);
    } else {
      this.listItemAddToCart = [];
    }
    if (this.item) {
      this.item.amount += 1;
    } else {
      data.amount = 1;
      // if (!this.listItemAddToCart) {
      //   this.listItemAddToCart = [];
      // }
      this.listItemAddToCart.push(data);
    }
    // const dataCartLocal = localStorage.getItem('dataCount');
    // tslint:disable-next-line: radix
    // if(parseInt(dataCartLocal) > 0) {
    //     this.listItemAddToCart = JSON.parse(localStorage.getItem('listItemAddToCart'))
    //     this.listItemAddToCart.push(data);
    // } else {
    //   this.listItemAddToCart.push(data);
    // }
    localStorage.setItem('listItemAddToCart', JSON.stringify(this.listItemAddToCart));

    if (this.router.url === '/cart') {
      this.count--;
    }
    this.count++;
    localStorage.setItem('dataCount', JSON.stringify(this.count));
  }

}
