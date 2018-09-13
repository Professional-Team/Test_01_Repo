/**
 * 
 */
package com.example.studentcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.basicstudent.Student;
import com.business.basicstudent.StudentDetailService;

/**
 * @author Mujahed
 *
 */
@RestController
@RequestMapping(value="/api/")
public class StudentDetailController {
	@Autowired
	StudentDetailService studentDetail;
	@RequestMapping(value="/getAllStudentDetail", method = RequestMethod.GET)
	public List<Student> getAllStudentDetail() {
		List<Student> studentList = new ArrayList<>();
		try {
			studentList = this.studentDetail.getAllStudentDetail();
		}  catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
	@RequestMapping(value="/getStudentByRollNo", method = RequestMethod.GET)
	public Student getStudentByRollNo(@RequestParam(value="rollNo") Long rollNo) {
		Student student = new Student();
		try {
			student = this.studentDetail.getStudentByRollNo(rollNo);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return student;
	}

}
