package com.codersathi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.codersathi.dto.EmployeeResponseDto;
import com.codersathi.entity.Employee;
import com.codersathi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	public EmployeeResponseDto getEmployees(Pageable pageable) {
		Page<Employee> page = employeeRepository.findAll(pageable);
		EmployeeResponseDto response = new EmployeeResponseDto();
		response.setTotal(page.getTotalElements());
		response.setEmployees(page.getContent());
		return response;
	}
	
	
}
