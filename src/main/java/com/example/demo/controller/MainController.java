package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeDataService;

@RestController
@RequestMapping("/user")
public class MainController {

	@Autowired
	EmployeeDataService empService;
	
	@GetMapping("/emp_data")
	public List<Employee> getEmployeeData() {
		return empService.getNonAdminEmployees();
	}

	@PostMapping("/emp_data")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	@PutMapping("/emp_data")
	public Employee updateEmployee( @RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}
	
	@GetMapping("/matured_user")
	public List<Employee> getMaturedEmployees() {
		return empService.getMaturedEmployees();
	}
	@GetMapping("/")
	public String homePage() {
		return "<h1>WELCOME USER!!</h1>";
	}
	
}
