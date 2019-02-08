package com.mahendra.mumbaibank.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.CustomerDAO;
import com.mahendra.mumbaibank.entities.Customer;
import com.mahendra.mumbaibank.services.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	@Override
	public void save(Customer customer) {
		dao.save(customer);
	}

	@Override
	public Customer findById(String customerId) {
		// TODO Auto-generated method stub
		System.out.println("CustomerService FINDBYID");

		return dao.findById(customerId);
	}

}
