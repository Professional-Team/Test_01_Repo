import { Injectable } from '@angular/core';
import { HttpCallService } from '../../common/http-call.service';

@Injectable({
  providedIn: 'root'
})
export class StudentDetailService {

  constructor(private http: HttpCallService) { }
  
  getStudentByRollNo(obj) {
    return this.http.get('getStudentByRollNo?rollNo=' + obj)
  }

  getAllStudentDetail() {
    return this.http.get('getAllStudentDetail');
  }

}
