import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './account/login/login.component';
import { RegisterComponent } from './account/register/register.component';
import { CartComponent } from './cart/cart.component';
import { ProductDetailsComponent } from './product/product-details/product-details.component';
const routes: Routes = [
  { path: '', component: HomeComponent },
  {path : 'login' , component: LoginComponent},
  { path: 'register' , component: RegisterComponent},
  {path: 'cart', component: CartComponent},
  { path: 'products/:productId', component: ProductDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}


