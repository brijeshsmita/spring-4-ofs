package com.mahendra.mumbaibank.services;

import com.mahendra.mumbaibank.entities.Customer;

public interface CustomerService {
	void save(Customer customer);
	Customer findById(String customerId);
}
