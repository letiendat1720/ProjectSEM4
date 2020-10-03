import { Component, OnInit } from '@angular/core';
import { ThemePalette } from '@angular/material/core';
import * as $ from 'jquery';
import {CartService} from '../../service/cart.service'
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  ngOnInit(): void {
  }
  constructor(public cartService: CartService){}
}
