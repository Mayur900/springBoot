package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Student;
import com.emp.service.StudentService;

@RestController
public class StudentControler {

	
	@Autowired
	public StudentService stService;
	
	@GetMapping(path =  "/getAllStudent")
	public List<Student> getAllStudent() {
		return stService.getAllStudent();
	}
	
	@PostMapping(path =  "/saveStudent")
	public Student saveStudent(@RequestBody Student s) {
		return stService.saveStudent(s);
	}
	
	
	
	
}
