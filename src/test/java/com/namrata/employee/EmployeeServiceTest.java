package com.namrata.employee;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.namrata.employee.model.Employee;
import com.namrata.employee.service.EmployeeService;

public class EmployeeServiceTest {
	
	@Test
	public void testGetHighEarners() {
		List<Employee> employees = Arrays.asList(
				new Employee("Namrata", "IT", 290000),
				new Employee("Preeti", "IT", 290000),
				new Employee("Praful", "IT", 290000));
			
		
		EmployeeService service  = new EmployeeService();
		List<Employee> result = service.getHighEarners(employees, 12000);
		assertEquals(3, result.size());
		assertTrue(result.stream().allMatch(e -> e.getSalary() > 12000));
	}
}
