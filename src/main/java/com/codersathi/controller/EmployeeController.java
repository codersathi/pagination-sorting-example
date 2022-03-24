package com.codersathi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codersathi.dto.EmployeeResponseDto;
import com.codersathi.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public EmployeeResponseDto getEmplloyees(Pageable pageable) {
		return employeeService.getEmployees(pageable);
	}
}
