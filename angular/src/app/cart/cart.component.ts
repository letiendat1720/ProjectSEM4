import { Component, OnInit, Injector, Inject, Input, Output, EventEmitter } from '@angular/core';
import { timers } from 'jquery';
import { CartService } from '../service/cart.service';
import {ConnectionService} from 'ng-connection-service';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  constructor(public cartService: CartService, public connectService: ConnectionService) {
  }

  @Input() product: any;
  @Output() productRemoved = new EventEmitter();
  cartItems;
  countProduct = 1;
  totalPrice = 0;
  status = 'ONLINE';
  isConnected = true;
  // tslint:disable-next-line: typedef
  cartItem() {
    const data = localStorage.getItem('listItemAddToCart');
    this.cartItems = JSON.parse(data);
    if(this.cartItems){
      this.cartItems.map(data => {
        this.totalPrice = this.totalPrice + data.productConfiguration.price;
      })
    }
  }
  // tslint:disable-next-line: typedef
  deleteItem(item) {
    this.totalPrice = this.totalPrice - item.productConfiguration.price;
    const data = this.cartItems.filter(data => data.id !== item.id);
    const dataRemove = this.cartItems.filter(data => data.id === item.id);
    const countProduct = localStorage.getItem('dataCount');
    // tslint:disable-next-line: radix
    const productCurrent = parseInt(countProduct) - dataRemove.length;
    localStorage.setItem('dataCount', JSON.stringify(productCurrent));
    this.cartItems = data;
    localStorage.setItem('listItemAddToCart', JSON.stringify(this.cartItems));
    this.cartService.count = localStorage.getItem('dataCount');
    if(this.cartService.count == 0) {
      localStorage.clear();
    }
  }
  ngOnInit(): void {
    this.cartItem();
}
add() {
  this.countProduct++;
}
remove() {
    if(this.countProduct >= 2){
      this.countProduct--;
    }
}
}
