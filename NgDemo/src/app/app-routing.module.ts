import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { StudentDetailComponent } from './student/component/student-detail.component';

const routs: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'student', component: HomeComponent, children: [
    {path: '', component: StudentDetailComponent}
  ]},
  {path: '', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routs)
  ],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
