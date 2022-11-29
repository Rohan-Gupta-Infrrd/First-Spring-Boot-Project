package com.rohangupta029.demo.model;

import java.util.UUID;

public class Student {
	private final UUID id;
	private final int age;
	private String Firstname;
	private String Lastname;
	private String course;
	
	
	public Student(UUID id, int age, String firstname, String lastname, String course) {
		super();
		this.id = id;
		this.age = age;
		Firstname = firstname;
		Lastname = lastname;
		this.course = course;
	}


	public String getFirstname() {
		return Firstname;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public UUID getId() {
		return id;
	}


	public int getAge() {
		return age;
	}
	
	
	
	
	

}
