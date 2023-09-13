package com.jsp.hibernateMapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Getter
@Setter
@ToString
@Entity
@Builder
@Table(name = "bankaccount_table")
public class BankAccount 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankAccountId;
	private String bankAccountNo;
	private String IFSCcode;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "bankAccount")
	@JoinColumn(name = "employeeIdFk")
	private Employee employee;
}
