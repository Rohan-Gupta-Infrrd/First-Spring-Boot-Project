package com.rohangupta029.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	private UUID id;
	private int age;
	private String Firstname;
	private String Lastname;
	private String course;
	
	
	public Student(@JsonProperty("id") UUID id, @JsonProperty("age") int age, @JsonProperty("firstname")String firstname, @JsonProperty("lastname")String lastname, @JsonProperty("course") String course) {
		super();
		this.id = id;
		this.age = age;
		Firstname = firstname;
		Lastname = lastname;
		this.course = course;
	}

	
	public void setId(UUID id) {
		this.id = id;
	}


	public void setAge(int age) {
		this.age = age;
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
