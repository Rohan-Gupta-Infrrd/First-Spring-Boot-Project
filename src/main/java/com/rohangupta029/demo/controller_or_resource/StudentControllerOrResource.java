package com.rohangupta029.demo.controller_or_resource;



import java.util.List;
import java.util.UUID;

import com.rohangupta029.demo.model.Student;
import com.rohangupta029.demo.DAO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.http.MediaType;
import com.rohangupta029.demo.service.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("api/v1/students")
@RestController

public class StudentControllerOrResource {

	private final StudentService studentservice;
	
	@Autowired

	public StudentControllerOrResource(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	@RequestMapping(
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public List<Student> getAllStudent()
	{
		return studentservice.getAllStudent();
	}
	
	
	@RequestMapping(
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			path= "{studentid}"
			)
	public Student getStudentById(@PathVariable("studentid") UUID studentid)
	{
		return studentservice.getStudentById(studentid);
	}
	
	@RequestMapping(
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public void insertNewStudent(@RequestBody Student student)
	{
		studentservice.persistNewStudent(UUID.randomUUID(),student);
		
	}
	
	@RequestMapping(
			method=RequestMethod.PUT,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			path="{studentid}"
			)
	public void updateStudentById(@PathVariable("studentid") UUID studentid, @RequestBody Student student)
	{
		studentservice.updateStudentById(studentid, student);
		
	}
	
	@RequestMapping(
			method=RequestMethod.DELETE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			path= "{studentid}"
			)
	public void deleteStudentById(@PathVariable("studentid") UUID studentid)
	{
		 studentservice.deletestudentById(studentid);
	}
}
