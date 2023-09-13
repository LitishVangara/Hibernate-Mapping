package com.jsp.hibernateMapping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.hibernateMapping.entity.BankAccount;
import com.jsp.hibernateMapping.repository.BankAccountRepository;

@Component
public class BankAccountDAOImp implements BankAccountDAO
{
	@Autowired
	private BankAccountRepository bankAccountRepository;
	@Override
	public int saveBankAccount(BankAccount bankAccount) 
	{
		return bankAccountRepository.save(bankAccount).getBankAccountId();
	}
}
