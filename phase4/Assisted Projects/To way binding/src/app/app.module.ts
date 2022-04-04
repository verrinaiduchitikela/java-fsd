import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';

import { ConvertToSpacesPipe } from './convert-to-spaces.pipe';

@NgModule({
  declarations: [
    AppComponent,
   
    ConvertToSpacesPipe,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProductComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }