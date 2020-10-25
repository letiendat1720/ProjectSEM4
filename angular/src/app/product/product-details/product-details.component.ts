import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CartService } from 'src/app/service/cart.service';
import { ProductService } from 'src/app/service/product.service';
import {ProductComponent, ProductDto} from '../../product/product.component';
@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  constructor(
    private route: ActivatedRoute,
    private productService: ProductService,
    public cartService: CartService,
  ) { }
    productDetail;
    productList: ProductDto[];
    productListAll: ProductDto[];

  slides = [
    {img: 'https://hanoicomputercdn.com/media/news/19_0828_banner_pcgm_tintuc.png'},
    {img: "https://genk.mediacdn.vn/2019/11/27/msibanner2019-1574849555204926741509.jpg"},
    {img: "https://www.acervietnam.com.vn/Data/Sites/1/News/9047/vg271up-ed245-tang-cestus310_-resize-1600x900.jpg"},
  ];
  slideConfig = {
    slidesToShow: 4,
    slidesToScroll: 4,
  slideConfig : {slidesToShow: 4, slidesToScroll: 4 ,
  nextArrow: '<div class=\'nav-btn next-slide\'><span class=\'material-icons\'>arrow_back_ios</span></div>',
  prevArrow: '<div class=\'nav-btn prev-slide\'><span class=\'material-icons\'>arrow_forward_ios</span></div>',
}
}
  ngOnInit(): void {
    const param = this.route.snapshot.paramMap.get('id');
    if (param) {
      const id = param;
      this.getProductDetail(id);
    }
  }
  getProductDetail(id: any) {
    this.productList = [];
    this.productDetail =[];
    this.productListAll = [];
    this.productService.getProductID(id).subscribe(data => {
     this.productDetail = data.result;
     this.productListAll = data.result;
     this.productService.getProduct().subscribe(res => {
      this.productList = res.result;
      this.productListAll = this.productList.filter(item => item.productType == this.productDetail.productType)
      this.productList = this.productList.filter(item => item.tradeMark == this.productDetail.tradeMark)
    // tslint:disable-next-line: align
    // tslint:disable-next-line: max-line-length
    });
    
    });
  }
  reload() {
    setTimeout(function(){location.reload()}, 500);
  }
}
