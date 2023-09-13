/*package com.jsp.hibernateMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.hibernateMapping.dao.BankAccountDAO;
import com.jsp.hibernateMapping.dao.EmployeeDAO;
import com.jsp.hibernateMapping.entity.Address;
import com.jsp.hibernateMapping.entity.BankAccount;
import com.jsp.hibernateMapping.entity.Employee;

import static com.jsp.hibernateMapping.service.StaticScannerAndPrint.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernateMappingApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HibernateMappingApplication.class, args);
		EmployeeDAO employeeDAO = configurableApplicationContext.getBean(EmployeeDAO.class);*/
		/*BankAccountDAO bankAccountDAO = configurableApplicationContext.getBean(BankAccountDAO.class);
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBankAccountNo("513hvj");
		bankAccount.setIFSCcode("hsbajc51323");
		println(bankAccount);
		Employee employee = new Employee();
		employee.setEname("Litish");
		employee.setSalary(53000);
		employee.setBankAccount(bankAccount);
		println(employee);
		BankAccount bankAccount2 = BankAccount.builder().bankAccountNo("hv5136").IFSCcode("thgch65434").build();
		println(bankAccount2);
		//By using Code Optimization, Write the code in below format
		Employee employee2 = Employee.builder().ename("Chandu").salary(53000).bankAccount(BankAccount.builder().bankAccountNo("gvh26").IFSCcode("gchh6232").build()).build();
		println(employee2);
		int id = employeeDAO.saveEmployee(employee2);*/
		/*Address address1 = Address.builder().area("MGBS").pincode("500001").build();
		Address address2 = Address.builder().area("CBS").pincode("500002").build();
		Address address3 = Address.builder().area("JBS").pincode("500032").build();
		List<Address> listofAddress = new ArrayList<Address>(); 
		listofAddress.add(address1);
		listofAddress.add(address2);
		listofAddress.add(address3);
		
		Employee employee = Employee.builder().ename("Litish").salary(80000).bankAccount(BankAccount.builder().bankAccountNo("ICICI-41236478").IFSCcode("ICICI6235145").build()).addresses(listofAddress).build();
		
		listofAddress.forEach(t->t.setEmployee(employee));
		
		int id = employeeDAO.saveEmployee(employee);
		
//		for (Address address :listofAddress)
//		{
//			address.setEmployee(employee);
//		}
		println("Employee id="+id);
	}
}*/
