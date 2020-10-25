import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Pipe, PipeTransform } from '@angular/core';
import { ProductService } from '../service/product.service';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  @Output() productAdded = new EventEmitter();
  constructor(private productService: ProductService) { }
  productList: ProductDto[];
  productListSell: ProductDto[];

  ngOnInit(): void {
    this.getProduct();
  }
  // tslint:disable-next-line: typedef

  addProductToCart(product) {
    this.productAdded.emit(product);
  }
  // tslint:disable-next-line: typedef
  getProduct() {
    this.productList = [];
    this.productService.getProduct().subscribe(res => {
      if (res.result) {
        this.productList = res.result;
      }
      this.productListSell = this.productList;
      this.productList = this.productList.sort((a, b) => {
        return (new Date(a.creationTime) as any) - (new Date(b.creationTime) as any)
      });
      this.productListSell = this.productListSell.slice(1, 7);
      this.productListSell = this.productListSell.sort((a, b) => {
        return a.total - b.total;
      })

    });
  }
  // tslint:disable-next-line: member-ordering
  slides = [
    { img: "https://genk.mediacdn.vn/2019/11/27/msibanner2019-1574849555204926741509.jpg" },
    { img: 'https://hanoicomputercdn.com/media/news/19_0828_banner_pcgm_tintuc.png' },
    { img: "https://www.acervietnam.com.vn/Data/Sites/1/News/9047/vg271up-ed245-tang-cestus310_-resize-1600x900.jpg" },
  ];
  // tslint:disable-next-line: member-ordering
  slideConfig = {
    slidesToShow: 1,
    slidesToScroll: 1,
    slideConfig: {
      slidesToShow: 1, slidesToScroll: 1,
      nextArrow: '<div class=\'nav-btn next-slide\'><span class=\'material-icons\'>arrow_back_ios</span></div>',
      prevArrow: '<div class=\'nav-btn prev-slide\'><span class=\'material-icons\'>arrow_forward_ios</span></div>',
    }
  }

  addSlide() {
    this.slides.push({ img: "http://placehold.it/350x150/777777" })
  }

  removeSlide() {
    this.slides.length = this.slides.length - 1;
  }

  slickInit(e) {
    console.log('slick initialized');
  }

  breakpoint(e) {
    console.log('breakpoint');
  }

  afterChange(e) {
    console.log('afterChange');
  }

  beforeChange(e) {
    console.log('beforeChange');
  }
}
export class ProductDto {
  id: string;
  name: string;
  cpu: string;
  ram: string;
  creationTime: string;
  graphic: string;
  storage: string;
  pin: string;
  mass: string;
  price: number;
  tradeMark: string;
  priceSale: number;
  operating: string;
  productType: number;
  imageString: string;
  total: number;
  productCofiguration: ProductConfiguration;
}
export class ProductConfiguration {
  name: string;
  color: string;
  tradeMark: string;
  mainBroad: string;
  hhd: string;
  ssd: string;
  card: string;
  cpu: string;
  chip: string;
  ram: string;
  vga: string;
  creationTime: string;
  screen: string;
  keyBroad: string;
  description: string;
  price: number;
  gurantee: number;
  total: number;
  id: number;
}
