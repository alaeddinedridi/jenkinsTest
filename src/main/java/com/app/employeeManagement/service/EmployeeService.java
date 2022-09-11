package com.app.employeeManagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.employeeManagement.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public ResponseEntity<Employee> getEmployeeById(long id);
	public ResponseEntity<Employee> updateEmployee(long id, Employee employee);
	public String deleteEmployee(long id);
}
