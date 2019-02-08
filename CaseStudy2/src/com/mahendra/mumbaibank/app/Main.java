package com.mahendra.mumbaibank.app;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.dao.db.AccountDAOImpl;
import com.mahendra.mumbaibank.entities.Account;
import com.mahendra.mumbaibank.entities.Customer;
import com.mahendra.mumbaibank.services.CustomerService;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	AccountDAO dao = context.getBean(AccountDAOImpl.class);
	Account acc = new Account();
	acc.setAccountNo("12345");
	acc.setAccType("Savings");
	acc.setBalance(12000);
	acc.setDateOpening(buildDate());
	dao.save(acc);		
	
	Account acc2 = dao.findById("12345");
	System.out.println(acc2.getAccType()+" "+acc2.getBalance());
	
	}

	private static Date buildDate(){
		Calendar c = Calendar.getInstance();
		c.set(2010, 1, 1);
		return c.getTime();
	}
}
