import { Component, OnInit, Injector, Output, Input, EventEmitter } from '@angular/core';
import 'swiper/swiper-bundle.css';
import Swiper, { Navigation, Pagination } from 'swiper';
import {} from '../service/cart.service';
import {CartService} from '../service/cart.service';
Swiper.use([Navigation, Pagination]);
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit  {
  @Input()  products: any []
  @Output() productRemoved = new EventEmitter();
  @Output() cartProductList = [];
  @Input() productList = [
    {
      name : 'Laptop Dell Inspiron 15 3593-70211826',
      id : 4,
      price : 2000000,
      priceSale : 1300000,
      image : 'https://lh3.googleusercontent.com/dD0TFbykM-_cF1uT8hNWKU-tim92I4X3qLfPGs44uXzrIF5YjYP44svqNkSptkUajHh4aZThMGLKax6hEJo=w500-rw'
    },
    {
      name : 'Laptop Dell Inspiron 3593-70197457',
      id : 2323,
      price : 1832332,
      priceSale : 1222213,
      image : 'https://lh3.googleusercontent.com/ghCl2tXJQAxavE8LdxRz854XCUAxYaFr0EnlHoNFf9_ZJ5_YDzWTebFs4hxsL1XaKm-_1LG4eI2c6A10aSk=w500-rw'

    },
    {
      name : 'Laptop Dell Inspiron 15 3593-N3593D',
      id : 2233,
      price : 12212331,
      priceSale : 12131322,
      image : 'https://lh3.googleusercontent.com/dD0TFbykM-_cF1uT8hNWKU-tim92I4X3qLfPGs44uXzrIF5YjYP44svqNkSptkUajHh4aZThMGLKax6hEJo=w500-rw'

    },
    {
      name : 'Màn hình Dell 27" U2720Q (3840 x 2160/IPS/60Hz/8 ms',
      id : 123,
      price : 2323232,
      priceSale : 1223232,
      image : 'https://lh3.googleusercontent.com/fYPstb4AIBupZDKSPgq30Onap3fXgI_A5Ic_IURn_JrXUP5uKWnTyGj2BQekJNsvjXE9_cKfbptcajphCjPV=w500-rw'

    },
    {
      name : 'Laptop Dell Inspiron 15 3593-N3593D',
      id : 2233,
      price : 12212331,
      priceSale : 12131322,
      image : 'https://lh3.googleusercontent.com/dD0TFbykM-_cF1uT8hNWKU-tim92I4X3qLfPGs44uXzrIF5YjYP44svqNkSptkUajHh4aZThMGLKax6hEJo=w500-rw'

    },
    {
      name : 'Laptop Dell Inspiron 15 3593-N3593D',
      id : 2233,
      price : 12212331,
      priceSale : 12131322,
      image : 'https://lh3.googleusercontent.com/dD0TFbykM-_cF1uT8hNWKU-tim92I4X3qLfPGs44uXzrIF5YjYP44svqNkSptkUajHh4aZThMGLKax6hEJo=w500-rw'

    },
    {
      name : 'Laptop Dell Inspiron 15 3593-N3593D',
      id : 2233,
      price : 12212331,
      priceSale : 12131322,
      image : 'https://lh3.googleusercontent.com/dD0TFbykM-_cF1uT8hNWKU-tim92I4X3qLfPGs44uXzrIF5YjYP44svqNkSptkUajHh4aZThMGLKax6hEJo=w500-rw'

    },
  ];
countProdcuctCar= 0;
  addProductToCart(data: any) {
    this.cartProductList.push(data);
    this.countProdcuctCar += 1;
    console.log(this.cartProductList);
    
  }
  constructor(public cartService: CartService) {
  }
  ngOnInit(): void {
  }
  removeProduct(product) {
    this.productRemoved.emit(product)
  }
}
