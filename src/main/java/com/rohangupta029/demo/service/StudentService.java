package com.rohangupta029.demo.service;

import java.util.List;
import java.util.UUID;

import com.rohangupta029.demo.model.Student;
import com.rohangupta029.demo.DAO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service

public class StudentService {

	
	private final StudentDAO studentdao;
	
	
	@Autowired
	public StudentService(@Qualifier("fakeDao")StudentDAO studentdao) {
		super();
		this.studentdao = studentdao;
	}

	public int PersistNewStudent(UUID studentid, Student student)
	{
		UUID studentuuid= studentid==null? UUID.randomUUID():studentid;
		
		return studentdao.InsertNewStudent(studentuuid, student);
		
	}
	
	public Student getStudentById(UUID studentId)
	{
		return studentdao.selectStudentById(studentId);
	}
	public List<Student> getAllStudent()
	{
		return studentdao.selectAllStudent();
	}
	
	public int updateStudentById(UUID studentid, Student newStudent)
	{
		return studentdao.updateStudentById(studentid, newStudent);
	}
	public int deletestudentById(UUID studentid)
	{
		return studentdao.deletestudentById(studentid);
	}
}
