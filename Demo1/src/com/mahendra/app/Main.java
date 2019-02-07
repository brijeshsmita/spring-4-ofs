package com.mahendra.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahendra.business.CustomerManager;
import com.mahendra.dao.CustomerDAO;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	CustomerManager cm = context.getBean(CustomerManager.class);
	CustomerDAO dao1 = context.getBean(CustomerDAO.class);
	CustomerDAO dao2 = context.getBean(CustomerDAO.class);
	CustomerManager cm2 = (CustomerManager) context.getBean("b2");
	cm.save();
	}

}
