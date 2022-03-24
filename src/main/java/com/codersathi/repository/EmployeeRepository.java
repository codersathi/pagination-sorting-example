package com.codersathi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersathi.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
