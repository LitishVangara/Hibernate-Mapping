package com.jsp.hibernateMapping.services;

import com.jsp.hibernateMapping.dto.EmployeeDTO;

public interface EmployeeService 
{
	EmployeeDTO fetchEmployeeById(int id);
}
