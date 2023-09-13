package com.jsp.hibernateMapping.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.hibernateMapping.entity.Employee;
import com.jsp.hibernateMapping.repository.EmployeeRepository;

@Component
public class EmployeeDAOImp implements EmployeeDAO
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public int saveEmployee(Employee employee) 
	{
		Employee employee2 = employeeRepository.save(employee);
		return employee2.getEid();
	}
}
