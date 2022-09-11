package com.app.employeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.employeeManagement.exception.ResourceNotFoundException;
import com.app.employeeManagement.model.Employee;
import com.app.employeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public ResponseEntity<Employee> getEmployeeById(long id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found."));
		return ResponseEntity.ok(employee);
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(long id, Employee employee) {
		Employee newEmployee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found."));
		newEmployee.setFirstName(employee.getFirstName());
		newEmployee.setLastName(employee.getLastName());
		newEmployee.setEmail(employee.getEmail());
		
		Employee updatedEmployee = employeeRepository.save(newEmployee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@Override
	public String deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		return "Deleted";
	}
	
	
	
}
