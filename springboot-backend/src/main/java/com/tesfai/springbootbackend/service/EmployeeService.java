package com.tesfai.springbootbackend.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import com.tesfai.springbootbackend.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public ResponseEntity<Employee> getEmployeeById(Long id);
	public ResponseEntity<Employee> updateEmployeeById(Long id, Employee employee) ;
	public ResponseEntity<Map<String,Boolean>> deleteEmployeeById( Long id);
	public Employee createEmployee(Employee employee);

}
