package com.mahendra.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mahendra.dao.CustomerDAO;

@Component("b2") //Create BEAN ID="b2"
@Scope("prototype")
public class CustomerManager {

	private CustomerDAO dao;
	
	@Autowired //-> When used on "Constructor" Constructor Injection
	public CustomerManager(CustomerDAO dao) {
this.dao = dao;
	System.out.println("Created instanced of business tier");
	}
	
	public void save(){
		dao.save();
	}
}
