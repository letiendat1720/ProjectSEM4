import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './account/login/login.component';
import { RegisterComponent } from './account/register/register.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import {AppRoutingModule} from './app-routing.module';
import { HeaderComponent } from './share/header/header.component';
import { FooterComponent } from './share/footer/footer.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import {MatInputModule} from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import { CartComponent } from './cart/cart.component';
import { ProductComponent } from './product/product.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ShoppingCartComponent } from './cart/shopping-cart/shopping-cart.component';
import { ProductDetailsComponent } from './product/product-details/product-details.component';
import { NavigationComponent } from './share/navigation/navigation.component';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import {SlickCarouselModule} from 'ngx-slick-carousel';
import {MatBadgeModule} from '@angular/material/badge';
import { BuildpcComponent } from './buildpc/buildpc.component';
import { TinTucComponent } from './tin-tuc/tin-tuc.component';
import { ContactComponent } from './contact/contact.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    CartComponent,
    ProductComponent,
    ProductListComponent,
    ShoppingCartComponent,
    ProductDetailsComponent,
    NavigationComponent,
    BuildpcComponent,
    TinTucComponent,
    ContactComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    MatInputModule,
    MatIconModule,
    SlickCarouselModule,
    MatBadgeModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
