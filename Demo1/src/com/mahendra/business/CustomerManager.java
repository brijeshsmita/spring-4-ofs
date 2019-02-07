package com.mahendra.business;

import com.mahendra.dao.CustomerDAO;

public class CustomerManager {

	private CustomerDAO dao;
	
	public CustomerManager(CustomerDAO dao) {
this.dao = dao;
	}
	
	public void save(){
		dao.save();
	}
}
