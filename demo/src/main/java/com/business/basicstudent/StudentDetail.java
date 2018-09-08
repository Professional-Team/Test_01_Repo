/**
 * 
 */
package com.business.basicstudent;

import java.util.List;

import com.bean.basicstudent.Student;

/**
 * @author Mujahed
 *
 */
public interface StudentDetail {
	public List<Student> getAllStudentDetail();
	public Student getStudentByRollNo(Long rollNo);
}
