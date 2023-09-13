package com.jsp.hibernateMapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "address_table")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrId;
	private String area;
	private String pincode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id_fk")
	private Employee employee;
}
