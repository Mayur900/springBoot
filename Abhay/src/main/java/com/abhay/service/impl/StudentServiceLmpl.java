package com.abhay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhay.modal.Student;
import com.abhay.repository.StudentRepository;
import com.abhay.service.StudentService;

@Service
public class StudentServiceLmpl implements StudentService {
	
	@Autowired
	public StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
