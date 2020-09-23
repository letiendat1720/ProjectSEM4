import { Component, OnInit, Injector, Inject, Input, Output, EventEmitter } from '@angular/core';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  @Input() product: any;
  @Output() productRemoved = new EventEmitter();
  modelChanged(product) {
     if (this.product.num === 0) {
      this.productRemoved.emit(this.product)
     }
  }
  constructor() {
   }

  ngOnInit(): void {
    console.log(this.product);
    $('input.input-qty').each(function() {
  // tslint:disable-next-line: one-variable-per-declaration
  let $this = $(this),
    qty = $this.parent().find('.is-form'),
    min = Number($this.attr('min')),
    max = Number($this.attr('max'))
  if (min == 0) {
    var d = 0;
  } else d = min
  $(qty).on('click', function() {
    if ($(this).hasClass('minus')) {
      if (d > min) d += -1
    } else if ($(this).hasClass('plus')) {
      var x = Number($this.val()) + 1
      if (x <= max) d += 1
    }
    $this.attr('value', d).val(d)
  })
})
  }
}
