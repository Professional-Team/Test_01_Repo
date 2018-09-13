/**
 * 
 */
package com.repository.basicstudent.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSourceExtensionsKt;
//import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Repository;

import com.bean.basicstudent.Student;
import com.repository.basicstudent.StudentDetailRepository;

//import javassist.expr.NewArray;

/**
 * @author Mujahed
 *
 */
@Repository
public class StudentDetailRepositoryImpl implements StudentDetailRepository  {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	RowMapper rowMapper = new RowMapper() {
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student std = new Student();
			std.setRollNo(rs.getLong("ROLL_NO"));
			std.setStudentName(rs.getString("STUDENT_NAME"));
			std.setGender(rs.getString("GENDER"));
			std.setAdmissionDate(rs.getDate("ADMISSION_DATE"));
			return std;
			
		}
	};
	
	
	private String getStudentByRollNoQuery = "SELECT ROLL_NO, STUDENT_NAME, GENDER, ADMISSION_DATE FROM STUDENT WHERE ROLL_NO = :rollNo";
/*	private SqlParameterSource queryNameedParam(Object ...nameParams) {
		if(nameParams.length % 2 != 0) {
			throw new IllegalArgumentException("Invalid Query Param");
		}
		
		for(int i = 0; i < nameParams.length; i += 2) {
			parameters.
		}
		return null;
	} */
	
	final String getAllStudentDetailQuery = "SELECT ROLL_NO, STUDENT_NAME, GENDER, ADMISSION_DATE FROM STUDENT";

	@Override
	public List<Student> getAllStudentDetail() {
		List<Student> studentList = Collections.emptyList();
		try {
			studentList = namedParameterJdbcTemplate.query(getAllStudentDetailQuery, rowMapper);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public Student getStudentByRollNo(final Long rollNo) {
		final MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("rollNo", rollNo);
		Student student = new Student();
		try {
			List<Student> stdList = namedParameterJdbcTemplate.query(getStudentByRollNoQuery,parameters, rowMapper);
			if(!stdList.isEmpty()) {
				student = stdList.get(0);
			}
		} catch(Exception e) { e.printStackTrace();}
		return student;
	}

}
