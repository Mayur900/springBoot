package com.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "firstName")
	private String name;
	
	private String lastName;
	
	private String mobile;
	
	private int age;
	
	private String address;
	
	private String dept;
	
	private String post;
	
	public Employee(){
		
	}
	
	
}
