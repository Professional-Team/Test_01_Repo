/**
 * 
 */
package com.repository.basicstudent;

import java.util.List;

import com.bean.basicstudent.Student;

/**
 * @author Mujahed
 *
 */
public interface StudentDetailRepository {
	public List<Student> getAllStudentDetail();
	public Student getStudentByRollNo(Long rollNo);
}
