package com.jsp.hibernateMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.hibernateMapping.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> 
{
	
}
