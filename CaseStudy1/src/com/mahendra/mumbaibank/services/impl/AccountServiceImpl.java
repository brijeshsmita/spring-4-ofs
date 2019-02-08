package com.mahendra.mumbaibank.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.entities.Account;
import com.mahendra.mumbaibank.services.AccountService;

@Component
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO dao;
	
	@Override
	public void save(Account account) {
		dao.save(account);
	}

	@Override
	public Account findById(String accountNo) {	
		System.out.println("AccountService FINDBYID");
		return dao.findById(accountNo);
	}

}
