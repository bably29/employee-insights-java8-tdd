package com.namrata.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import com.namrata.employee.model.Employee;

public class EmployeeService {

	public List<Employee> getHighEarners(List<Employee> employees, int minSalary) {
		
		return employees.stream()
						.filter(employee -> employee.getSalary()>minSalary)
						.collect(Collectors.toList());
		
	}

	
}
