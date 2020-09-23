import { Component, OnInit } from '@angular/core';
import { ThemePalette } from '@angular/material/core';
import { Orientation } from '@ngmodule/material-carousel';
import * as $ from 'jquery';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  public slidesList = new Array<never>(5);
  public showContent = false;

  public parentHeight = 'auto';
  public timings = '250ms ease-in';
  public autoplay = true;
  public interval = 5000;
  public loop = true;
  public hideArrows = false;
  public hideIndicators = false;
  public color: ThemePalette = 'accent';
  public maxWidth = 'auto';
  public maintainAspectRatio = true;
  public proportion = 25;
  public slideHeight = '200px';
  public slides = this.slidesList.length;
  public overlayColor = '#00000040';
  public hideOverlay = false;
  public useKeyboard = true;
  public useMouseWheel = false;
  public orientation: Orientation = 'ltr';
  public log: string[] = [];
  constructor() { }
  mySlideImages = ['../assets/images/image1.jpg','../assets/images/image2.jpeg','../assets/images/image3.jpg'];
  myCarouselImages =['../assets/images/image1.jpg','../assets/images/image2.jpeg','../assets/images/image3.jpg'];
  mySlideOptions={items: 1, dots: true, nav: true};
  myCarouselOptions={items: 3, dots: true, nav: true};
  ngOnInit(): void {
  }

}
