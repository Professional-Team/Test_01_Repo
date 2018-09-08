import { Component, OnInit } from '@angular/core';
import { HttpCallService } from '../common/http-call.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  silde: boolean;

  constructor(private http: HttpCallService) { }

  ngOnInit() {
  }
   openNav() {
    document.getElementById('mySidenav').style.width = '250px';
    document.getElementById('main').style.marginLeft = '250px';
    this.silde = true;
}

 closeNav() {
    document.getElementById('mySidenav').style.width = '0';
    document.getElementById('main').style.marginLeft = '0';
    this.silde = false;
    this.http.get('http://localhost:8080/getStudentByRollNo?rollNo=405');
}
  toggleNav() {
    if (this.silde) {
      this.closeNav();
    } else {
      this.openNav();
    }
  }





}
