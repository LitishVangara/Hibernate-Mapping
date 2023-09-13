package com.jsp.hibernateMapping.services;

import static com.jsp.hibernateMapping.service.StaticScannerAndPrint.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.hibernateMapping.dto.AddressDTO;
import com.jsp.hibernateMapping.dto.BankAccountDTO;
import com.jsp.hibernateMapping.dto.EmployeeDTO;
import com.jsp.hibernateMapping.entity.Employee;
import com.jsp.hibernateMapping.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public EmployeeDTO fetchEmployeeById(int id) 
	{
		//To call method from Repository
		Optional<Employee> optional = employeeRepository.findByEmployeeId(id);
		//To check weather Record is Present or Not
		if (optional.isPresent()) 
		{
			//To retrieve the Employee Data
			Employee employee = optional.get();
			//To transfer Data from Entity to DTO
			EmployeeDTO employeeDTO = EmployeeDTO.builder()
					.ename(employee.getEname())
					.salary(employee.getSalary())
					.bankAccountDTO(BankAccountDTO.builder()
							.accountNo(employee.getBankAccount().getBankAccountNo())
							.IFSCcode(employee.getBankAccount().getIFSCcode())
							.build())					
					/*.addressDTO(AddressDTO.builder()
							.area(employee.getAddress().getArea())
							.pincode(employee.getAddress().getPincode())
							.build())
					.addressDTO(AddressDTO.builder()
							.area(employee.getAddresses().add(employee.getAddress().getArea()))
							.pincode(employee.getAddresses().add(employee.getAddress().getPincode()))
							.build())*/
					.build();
			println(employeeDTO);
			return employeeDTO;
		}
		else
		{
			return null;
		}
	}
	
}
