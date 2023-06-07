package com.abhay.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhay.modal.Student;

@RestController
public class StudentController {
	@GetMapping(path = "/getAllStudent")
	public List<Student> getAllStudent(){
		return null;	
	}
}
