package com.mahendra.mumbaibank.dao.collections;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.entities.Account;

@Component
public class AccountDAOCollectionImpl implements AccountDAO {

	private List<Account> accounts = new LinkedList<>();
	@Override
	public void save(Account account) {
		accounts.add(account);
	}

	@Override
	public Account findById(String accountNo) {
		for(Account a: accounts){
			if(a.getAccountNo().equalsIgnoreCase(accountNo))
				return a;
		}
		return null;
	}

}
