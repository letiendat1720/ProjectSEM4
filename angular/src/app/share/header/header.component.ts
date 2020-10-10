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
      this.handle();
  }
  constructor(public cartService: CartService){}
  
  handle() {
    // console.log(window.location.pathname);
    
    // if (window.location.pathname == '/') {
    //   document.getElementById("block").style.display = 'block';
    // } else {
    //   document.getElementById("block").style.display = 'none';
    // }

  }
  showCate(){

      // tslint:disable-next-line: triple-equals
      if(document.getElementById('block-child').style.display ==  'none') {
        document.getElementById('block-child').style.display =  'block';

      } else {
        document.getElementById('block-child').style.display =  'none';

      }
      
    }
  
  
};
