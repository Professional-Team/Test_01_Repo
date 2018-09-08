/**
 * 
 */
package com.bean.basicstudent;

import java.util.Date;

/**
 * @author Mujahed
 *
 */
public class Student {
	private String studentName;
	private Long rollNo;
	private String gender;
	private Date admissionDate;
	
	public Student() {
//		Student
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

}
