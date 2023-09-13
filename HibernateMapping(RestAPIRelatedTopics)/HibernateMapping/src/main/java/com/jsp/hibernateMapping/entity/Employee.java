package com.jsp.hibernateMapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Builder
@Table(name = "emp_table")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;
	//Mapping
	//To Save all the Objects by Using Cascade Annotation
	@OneToOne(cascade = CascadeType.ALL)
	//To Modify Foreign Column Name
	@JoinColumn(name = "bankAccountIdFk")
	private BankAccount bankAccount;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	List<Address> addresses;
}
