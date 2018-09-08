package com.business.basicstudent.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bean.basicstudent.Student;
import com.business.basicstudent.StudentDetail;

@Service
public class StudentDetailImpl  implements StudentDetail {

	@Override
	public List<Student> getAllStudentDetail() {
		Student stnd1 = new Student();
		stnd1.setStudentName("Syed Yaseen Uddin");
		stnd1.setRollNo(405l);
		stnd1.setGender("M");
		stnd1.setAdmissionDate(new Date());
		
		Student stnd2 = new Student();
		stnd2.setStudentName("Mohammed Mujahedullah Khan");
		stnd2.setRollNo(422l);
		stnd2.setGender("M");
		stnd2.setAdmissionDate(new Date());
		
		List<Student> resultList = new ArrayList<>();
		resultList.add(stnd1);
		resultList.add(stnd2);
		
		return resultList;
	}

	@Override
	public Student getStudentByRollNo(Long rollNo) {
		Student stnd1 = new Student();
		stnd1.setStudentName("Syed Yaseen Uddin");
		stnd1.setRollNo(405l);
		stnd1.setGender("M");
		stnd1.setAdmissionDate(new Date());
		
		Student stnd2 = new Student();
		stnd2.setStudentName("Mohammed Mujahedullah Khan");
		stnd2.setRollNo(422l);
		stnd2.setGender("M");
		stnd2.setAdmissionDate(new Date());
		
		Map <Long, Student> resultMap = new HashMap<>();
		resultMap.put(stnd1.getRollNo(), stnd1);
		resultMap.put(stnd2.getRollNo(), stnd2);
		return resultMap.get(rollNo);
	}

}
