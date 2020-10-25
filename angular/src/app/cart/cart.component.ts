import { Component, OnInit, Injector, Inject, Input, Output, EventEmitter } from '@angular/core';
import { timers } from 'jquery';
import { CartService } from '../service/cart.service';
import { ConnectionService } from 'ng-connection-service';
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
    console.log(this.cartItems);
    if (this.cartItems) {
      this.cartItems.map(data => {
        this.totalPrice = this.totalPrice + (data.price * data.amount);
      })
    }
  }
  // tslint:disable-next-line: typedef
  deleteItem(item) {
      this.totalPrice = this.totalPrice - item.price;
      const data = this.cartItems.filter(data => data.id !== item.id);
      const dataRemove = this.cartItems.filter(data => data.id === item.id);
      console.log(dataRemove);
      const countProduct = localStorage.getItem('dataCount');
      if (!countProduct) {
          localStorage.clear();
      }
      // tslint:disable-next-line: radix
      if (dataRemove != null) {
      // tslint:disable-next-line: radix
      const productCurrent = parseInt(countProduct) - dataRemove[0].amount;
      localStorage.setItem('dataCount', JSON.stringify(productCurrent));
     
      }
      this.cartItems = data;
      localStorage.setItem('listItemAddToCart', JSON.stringify(this.cartItems));
      this.cartService.count = localStorage.getItem('dataCount');
      if (this.cartService.count == 0) {
        localStorage.clear();
      }
  }
  ngOnInit(): void {
    this.cartItem();
  }
  add(item) {
    item.amount++;
  }
  remove(item) {
    if (item.amount >= 2) {
      this.countProduct--;
    }
  }

  totalMoney() {
    let sum = 0;
    this.cartItems.forEach(item => {
      sum += item.amount * item.price

    })
    return sum;
  }
}
