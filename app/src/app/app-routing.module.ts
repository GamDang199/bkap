import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ErrorComponent } from './components/error/error.component';
import { HomeComponent } from './layout/home/home.component';
import { ManageCategoryComponent } from './layout/manage-category/manage-category.component';
import { ManageProductComponent } from './layout/manage-product/manage-product.component';
import { ManageUserComponent } from './layout/manage-user/manage-user.component';
import { OrderComponent } from './layout/order/order.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'user', component: ManageUserComponent},
  {path: 'product', component: ManageProductComponent},
  {path: 'category', component: ManageCategoryComponent},
  {path: 'order', component: OrderComponent},
  {path: '**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
