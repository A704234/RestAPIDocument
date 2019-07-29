package com.atos.equens.worldline.SimpleSpringRestAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.equens.worldline.SimpleSpringRestAPI.DAO.EmployeeDAO;
import com.atos.equens.worldline.SimpleSpringRestAPI.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public List<Employee> getAllEmployee(){
		return employeeDAO.findAll();
	}
	
	public Employee addEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}
	
	public Optional<Employee> getEmployeeByID(int id) {
		return employeeDAO.findById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}
	
	public void deleteEmployeeById(int id) {
		employeeDAO.deleteById(id);
	}
	
	public void deleteAllEmployee() {
		employeeDAO.deleteAll();
	}
}
