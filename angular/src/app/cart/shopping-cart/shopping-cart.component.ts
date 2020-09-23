import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {
  @Input() product: any[];
  @Output() productRemoved = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  removeProduct(product) {
    this.productRemoved.emit(product)
  }
}
