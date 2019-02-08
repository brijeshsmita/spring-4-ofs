package com.mahendra.mumbaibank.app;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

import com.mahendra.mumbaibank.entities.Customer;
import com.mahendra.mumbaibank.services.CustomerService;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	CustomerService service = context.getBean(CustomerService.class);
	Customer cust = new Customer();
	cust.setCustomerId("1234");
	cust.setDateOfBirth(buildDate());
	cust.setFullname("Ajay Deol");
	service.save(cust);
	
	Customer c = service.findById("1234");
	System.out.println(c.getFullname());
	
	System.out.println("Context gave me instance of : "+service.getClass());
	
	AnnotationSessionFactoryBean factory = context.getBean(AnnotationSessionFactoryBean.class);
	
	
	}

	private static Date buildDate(){
		Calendar c = Calendar.getInstance();
		c.set(1984, 1, 1);
		return c.getTime();
	}
}
