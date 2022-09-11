package com.app.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.app.employeeManagement.service.EmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {
	@MockBean
	EmployeeService employeeService;
	 
	@Autowired
	MockMvc mockMvc;
	
	
}
