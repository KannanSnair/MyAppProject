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
@RequestMapping("/admin")
public class AdminUsersControllers {

	@Autowired
	EmployeeDataService empService;
	
	@GetMapping("/emp_data")
	public List<Employee> getEmployeeData() {
		return empService.getEmployees();
	}

	@PostMapping("/emp_data")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	@PutMapping("/emp_data/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		employee.setEmpId(id);
		return empService.updateEmployee(employee);
	}
	
	@GetMapping("emp_data/matured")
	public List<Employee> getMaturedEmployees() {
		return empService.getMaturedEmployees();
	}
	
	@GetMapping("/")
	public String homePage() {
		return "<h1>WELCOME ADMIN!!</h1>";
	}
}
