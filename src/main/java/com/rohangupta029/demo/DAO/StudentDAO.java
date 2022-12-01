package com.rohangupta029.demo.DAO;

import com.rohangupta029.demo.model.Student;
import java.util.UUID;
import java.util.List;


public interface StudentDAO {
	
	int InsertNewStudent(UUID studentid, Student student);
	Student selectStudentById(UUID studentId);
	List<Student> selectAllStudent();
	int updateStudentById(UUID studentid, Student newStudent);
	int deletestudentById(UUID studentid);

}
