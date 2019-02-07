package com.mahendra.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahendra.business.CustomerManager;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	CustomerManager cm = context.getBean(CustomerManager.class);
	cm.save();
	}

}
