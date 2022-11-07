import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './layout/home/home.component';
import { OrderComponent } from './layout/order/order.component';
import { ManageProductComponent } from './layout/manage-product/manage-product.component';
import { ManageCategoryComponent } from './layout/manage-category/manage-category.component';
import { ManageUserComponent } from './layout/manage-user/manage-user.component';
import { ErrorComponent } from './components/error/error.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    OrderComponent,
    ManageProductComponent,
    ManageCategoryComponent,
    ManageUserComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
