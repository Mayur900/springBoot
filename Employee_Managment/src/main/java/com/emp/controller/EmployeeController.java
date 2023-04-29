package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired(required = true)
	EmployeeService rmService;
	
	@GetMapping(path = "/getAllEmp")
	public List<Employee> getAllEmployee() {
		return rmService.getAllEmployee();
	}

	
	@GetMapping(path = "/getEmpId/{id}")
	public Employee getEmpById(@PathVariable int id) {
		System.out.println("getEmpById");
		return null;
	}
	
	@GetMapping(path = "/getEmpName/{name}")
	public Employee getEmpByName(@PathVariable String name) {
		System.out.println("getEmpByName");

		return null;
	}
	
	@PostMapping(path =  "/saveEmp")
	public Employee saveEmployee(@RequestBody Employee e) {
		return rmService.saveEmployee(e);
	}
	
	@PutMapping(path =  "/updateEmp")
	public Employee updateEmployee(@RequestBody Employee e) {
		System.out.println("updateEmployee");

		return null;
	}
	
	@DeleteMapping(path =  "/deleteEmp")
	public String deleteEmployee(@PathVariable int id) {
		System.out.println("deleteEmployee");

		return null;
	}
	
}
