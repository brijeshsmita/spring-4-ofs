package com.mahendra.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mahendra.business.CustomerManager;
import com.mahendra.dao.CustomerDAO;


// Configuration class to be used instead of XML file
@Configuration

public class Application {

	@Bean(name="b1")
	public CustomerDAO dao(){
		return new CustomerDAO();
	}
	
	@Bean(name="b3")
	public CustomerDAO dao2(){
		return new CustomerDAO();
	}
	
	
	@Bean(name="b2")
	public CustomerManager man(){
		return new CustomerManager(dao());
	}
	
}
