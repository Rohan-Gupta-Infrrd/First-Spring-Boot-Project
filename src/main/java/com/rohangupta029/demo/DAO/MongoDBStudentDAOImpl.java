package com.rohangupta029.demo.DAO;

import java.util.List;
import java.util.ArrayList;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.rohangupta029.demo.model.Student;


@Repository("MongoDBDao")
public class MongoDBStudentDAOImpl implements StudentDAO {

	@Override
	public int InsertNewStudent(UUID studentid, Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		
		List<Student> student= new ArrayList<>();
		student.add(new Student(UUID.randomUUID(),23,"Rohan","Gupta","MongoDB"));
		return student;
	}

	@Override
	public int updateStudentById(UUID studentid, Student newStudent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletestudentById(UUID studentid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
