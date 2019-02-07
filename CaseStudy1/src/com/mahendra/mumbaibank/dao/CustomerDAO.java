package com.mahendra.mumbaibank.dao;

import com.mahendra.mumbaibank.entities.Customer;

public interface CustomerDAO {
	void save(Customer customer);
	Customer findById(String customerId);
}
