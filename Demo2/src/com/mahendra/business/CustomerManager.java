package com.mahendra.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.dao.CustomerDAO;

@Component("b2")
public class CustomerManager {

	private CustomerDAO dao;
	
	@Autowired
	public CustomerManager(CustomerDAO dao) {
this.dao = dao;
	System.out.println("Created instanced of business tier");
	}
	
	public void save(){
		dao.save();
	}
}
