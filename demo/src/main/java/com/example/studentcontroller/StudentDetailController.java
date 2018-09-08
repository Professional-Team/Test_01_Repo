/**
 * 
 */
package com.example.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.basicstudent.Student;
import com.business.basicstudent.StudentDetail;

/**
 * @author Mujahed
 *
 */
@RestController
public class StudentDetailController {
	@Autowired
	StudentDetail studentDetail;
	@RequestMapping(value="/getAllStudentDetail", method = RequestMethod.GET)
	public List<Student> getAllStudentDetail() {
		return this.studentDetail.getAllStudentDetail();
	}
	@RequestMapping(value="/getStudentByRollNo", method = RequestMethod.GET)
	public Student getStudentByRollNo(@RequestParam(value="rollNo") Long rollNo) {
		return this.studentDetail.getStudentByRollNo(rollNo);
	}

}
