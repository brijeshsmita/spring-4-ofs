package com.mahendra.mumbaibank.dao.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.entities.Account;

//@Component
public class AccountDAOCollectionImpl implements AccountDAO {
	
	private Logger log = Logger.getLogger(this.getClass().getName());
	
	private List<Account> accounts = new LinkedList<>();
	@Override
	public void save(Account account) {
		//Embedding Cross Cutting Concern inside business logic
		log.info("About to save a record : "+account.getAccountNo());
		accounts.add(account);
		//concern1
		//concern2
		//concern3
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
