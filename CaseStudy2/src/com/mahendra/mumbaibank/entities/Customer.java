package com.mahendra.mumbaibank.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_id",length=10)
	private String customerId;
	@Column(name="fullname",length=40)
	private String fullname;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dateOfBirth;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
