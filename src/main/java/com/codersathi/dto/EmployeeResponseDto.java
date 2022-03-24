package com.codersathi.dto;

import java.util.List;

import com.codersathi.entity.Employee;

public class EmployeeResponseDto {

	private long total;
	private List<Employee> employees;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
