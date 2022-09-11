package com.app.employeeManagement.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.employeeManagement.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {
	@InjectMocks
    EmployeeService service;

	@Mock
    EmployeeRepository dao;
	
	
}
