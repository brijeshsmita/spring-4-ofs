package com.mahendra.mumbaibank.dao.collections;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.CustomerDAO;
import com.mahendra.mumbaibank.entities.Customer;

@Component
public class CustomerDAOCollectionImpl implements CustomerDAO {
	// Dummy dataset
	private List<Customer> customers = new LinkedList<>();

	@Override
	public void save(Customer customer) {
		customers.add(customer);
	}

	@Override
	public Customer findById(String customerId) {
		for (Customer c : customers) {
			if (c.getCustomerId().equalsIgnoreCase(customerId))
				return c;
		}
		return null;
	}

}
