package com.emp.service;

import java.util.List;

import com.emp.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public Student saveStudent(Student s);
	

}
