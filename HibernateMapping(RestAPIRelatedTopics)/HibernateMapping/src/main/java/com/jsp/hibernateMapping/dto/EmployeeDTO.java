package com.jsp.hibernateMapping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeDTO 
{
	private String ename;
	private double salary;
	private BankAccountDTO bankAccountDTO;
	private AddressDTO addressDTO;
}
