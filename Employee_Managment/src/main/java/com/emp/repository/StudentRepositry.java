package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Student;

public interface StudentRepositry extends JpaRepository<Student, Long> {

}
