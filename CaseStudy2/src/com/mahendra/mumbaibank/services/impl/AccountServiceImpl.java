package com.mahendra.mumbaibank.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.entities.Account;
import com.mahendra.mumbaibank.services.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO dao;
	
	@Transactional(propagation=Propagation.REQUIRED)
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
