package com.atos.equens.worldline.SimpleSpringRestAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.equens.worldline.SimpleSpringRestAPI.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
}
