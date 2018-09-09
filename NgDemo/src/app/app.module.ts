import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HttpCallService } from './common/http-call.service';
import { StudentDetailComponent } from './student/component/student-detail.component';
import { AppRoutingModule } from './/app-routing.module';
import { StudentDetailService } from './student/service/student-detail.service';
import { CommonModule } from '@angular/common';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentDetailComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    HttpClientModule,
    AppRoutingModule,
  ],
  providers: [
    HttpCallService,
    StudentDetailService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
