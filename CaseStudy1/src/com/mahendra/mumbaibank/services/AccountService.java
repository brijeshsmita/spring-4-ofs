package com.mahendra.mumbaibank.services;

import com.mahendra.mumbaibank.entities.Account;

public interface AccountService {
	void save(Account account);
	Account findById(String accountNo);
}
