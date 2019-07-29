package com.atos.equens.worldline.SimpleSpringRestAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.equens.worldline.SimpleSpringRestAPI.model.Employee;
import com.atos.equens.worldline.SimpleSpringRestAPI.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/getallemployees", method=RequestMethod.GET)
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}	
	
	@RequestMapping(
			value = "/addemployee", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public Employee addEmployee(@RequestBody Employee employee){
		return employeeService.addEmployee(employee);
	}
	
    @RequestMapping(
    		value = "/updateemployee", 
    		method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, 
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
    
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Employee> getEmployeeById(@PathVariable int  id){
		return employeeService.getEmployeeByID(id);
	}
	
	@RequestMapping(value = "/deleteallemployee", method = RequestMethod.DELETE)
	public void deleteAllEmployee(){
		employeeService.deleteAllEmployee();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEmployeeById(@PathVariable int  id){
		employeeService.deleteEmployeeById(id);
	}

}
