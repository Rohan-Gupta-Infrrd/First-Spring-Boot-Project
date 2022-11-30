package com.rohangupta029.demo.DAO;

import java.util.List;
import java.util.UUID;

import com.rohangupta029.demo.model.Student;

import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakeStudentDAO implements StudentDAO {

	private final HashMap<UUID, Student> database;
	
	


	public FakeStudentDAO() {
		//super();
		//this.database = database;
		database= new HashMap<>();
		UUID studentid=UUID.randomUUID();
		database.put(studentid, new Student(
				studentid,14,"Rohan","Gupta","Computer Science"
				)
					);
	}

	@Override
	public int InsertNewStudent(UUID studentid, Student student) {
		// TODO Auto-generated method stub
	
		database.put(studentid, student);
		return 1;
	}

	@Override
	public Student selectStudentById(UUID studentId) {
		// TODO Auto-generated method stub
		
		return database.get(studentId);
	}

	@Override
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		
		ArrayList<Student> value= new ArrayList<>();
		//value.add(database.values());
		return new ArrayList<>(database.values());
	}

	@Override
	public int updateStudentById(UUID studentid, Student newStudent) {
		// TODO Auto-generated method stub
		
		database.put(studentid, newStudent);
		return 1;
	}

	@Override
	public int deletestudentById(UUID studentid) {
		// TODO Auto-generated method stub
		database.remove(studentid);
		return 0;
	}

}
