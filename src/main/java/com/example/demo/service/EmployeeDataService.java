package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeDataService {

	@Autowired
	EmployeeDao empDao;
	
	public List<Employee> getEmployees() {
		return empDao.getAllEmployees();
	}
	
	public List<Employee> getNonAdminEmployees() {
		return empDao.getNonAdminEmployees();
	}
	public Employee addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}
	
	public Employee updateEmployee (Employee employee) {
		return empDao.updateEmployee(employee);
	}
	
	public List<Employee> getMaturedEmployees() {
		return empDao.getMaturedEmployees();
	}
}
