package com.jsp.hibernateMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static com.jsp.hibernateMapping.service.StaticScannerAndPrint.*;

import com.jsp.hibernateMapping.dto.EmployeeDTO;
import com.jsp.hibernateMapping.services.EmployeeService;

@SpringBootApplication
public class HibernateMappingApplication2 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HibernateMappingApplication2.class, args);
		EmployeeService employeeService = configurableApplicationContext.getBean(EmployeeService.class);
		EmployeeDTO employeeDTO = employeeService.fetchEmployeeById(2);
		if (employeeDTO != null) 
		{
			println(employeeDTO.getEname());
			println(employeeDTO.getBankAccountDTO().getAccountNo());
			//println(employeeDTO.getAddressDTO().getArea());
		}
		else
		{
			println("No Records Found...");
		}
	}
}
