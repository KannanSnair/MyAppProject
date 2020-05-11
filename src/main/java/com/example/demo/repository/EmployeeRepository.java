package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("select u from Employee u where u.empAge > 18 and u.userRole != 'ADMIN'")
	public List<Employee> findMaturedEmployees();
	
	@Query("select u from Employee u where u.userRole != 'ADMIN'")
	public List<Employee> findAllNonAdmins();
}
