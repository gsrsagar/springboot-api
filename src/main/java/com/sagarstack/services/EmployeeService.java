package com.sagarstack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagarstack.entities.Employee;
import com.sagarstack.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee findByName(String name) {
		return repo.findByName(name);
	}
	
	public List<Employee> findALl(){
		return this.repo.findAll();
	}
}
