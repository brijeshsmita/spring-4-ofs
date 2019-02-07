package com.mahendra.mumbaibank.entities;

import java.util.Date;

public class Account {
	private String accountNo;
	private String accType;
	private double balance;
	private Date dateOpening;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getDateOpening() {
		return dateOpening;
	}
	public void setDateOpening(Date dateOpening) {
		this.dateOpening = dateOpening;
	}
	
}
