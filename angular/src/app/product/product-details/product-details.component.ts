import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {ProductComponent} from '../../product/product.component'
@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  constructor(
    private route: ActivatedRoute,
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    console.log(id);
  }

}
