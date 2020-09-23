import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
@Input() products: any [];
@Output() productAdded = new EventEmitter();
@Input() cartProductList: any [];

  constructor() { }

  ngOnInit(): void {
    console.log(this.products);
  }
  addProductToCart(product) {
    this.productAdded.emit(product);
  }
}
