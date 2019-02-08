package com.mahendra.mumbaibank.dao;

import com.mahendra.mumbaibank.entities.Account;

public interface AccountDAO {
	void save(Account account);
	Account findById(String accountNo);
}
