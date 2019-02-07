package com.mahendra.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {

	public CustomerDAO() {
		System.out.println("Created an instance of DAO");
	}
	
	public void save(){
		System.out.println("Calling SAVE method!");
	}
}
