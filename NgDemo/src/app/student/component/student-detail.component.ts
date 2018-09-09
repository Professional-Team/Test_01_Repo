import { Component, OnInit } from '@angular/core';
import { StudentDetailService } from '../service/student-detail.service';
import { interval } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  allStudents: any[] = [];
  studentProperty = {'studentName': undefined,
                     'rollNo': undefined,
                     'gender': undefined,
                     'admissionDate': undefined};
  student = {};

  rollNo: number;
  showAlert: true;

  constructor(private studentDetailService: StudentDetailService) {
    this.student = this.studentProperty;
   }

  ngOnInit() {
    this.getAllStudentDetail();
  }

  getAllStudentDetail() {
    this.studentDetailService.getAllStudentDetail().subscribe((students: any[]) => {
      if(students.length === 0) {
          this.allStudents = [];
      } else {
        this.allStudents = students;
      }
    });
  }

  getStudentByRollNo(roll) {
    if(roll.value) {
    this.studentDetailService.getStudentByRollNo(roll.value)
    .subscribe((student: any) => {
      if(student && student.rollNo) {
        this.student = student;
      } else {
        this.student = this.studentProperty;
      }
    });
  }
}



}
