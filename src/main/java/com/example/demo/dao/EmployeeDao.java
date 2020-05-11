package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> getNonAdminEmployees() {
		return empRepository.findAllNonAdmins();
	}
	
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}
	
	
	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		return empRepository.save(employee);
	}
	
	public List<Employee> getMaturedEmployees() {
		return empRepository.findMaturedEmployees();
	}
}
