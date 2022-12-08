package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_table")
public class Customer {
	
	@Id
	private String userId;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String cpassword;
	@Column
	private String phoneNo;
	@Column
	private String location;
	
	
	
	public Customer() {
		super();
		
	}



	public Customer(String userId, String name, String password, String cpassword, String phoneNo, String location) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.cpassword = cpassword;
		this.phoneNo = phoneNo;
		this.location = location;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCpassword() {
		return cpassword;
	}



	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
	
	

}
