package com.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeRepository emRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		return emRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee e) {
		return emRepository.save(e);
	}

}
