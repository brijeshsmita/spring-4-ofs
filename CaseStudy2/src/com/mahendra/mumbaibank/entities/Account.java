package com.mahendra.mumbaibank.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
	@Id @Column(name="account_no",length=10)
	private String accountNo;
	
	@Column(name="acc_type",length=10)
	private String accType;
	
	
	private double balance;
	
	@Column(name="opening_date")
	@Temporal(TemporalType.DATE)
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
