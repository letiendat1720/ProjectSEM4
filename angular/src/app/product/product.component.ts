import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Pipe, PipeTransform } from '@angular/core';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  @Input() product: any;
  @Output() productAdded = new EventEmitter();
  constructor() { }
  ngOnInit(): void {
  }
  addProductToCart(product) {
    this.productAdded.emit(product);
  }
}
