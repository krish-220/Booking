package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carpenter_table")
public class Carpenter {
	
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String password;
	@Column 
	private String phoneNo;
	@Column
	private String service;
	@Column
	private int serviceAmt;
	@Column
	private String accNo;
	@Column 
	private String ifscCode;
	
	public Carpenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carpenter(String id, String name, String phoneNo, String service, int serviceAmt, String accNo,
			String ifscCode,String password) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.service = service;
		this.serviceAmt = serviceAmt;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.password=password;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getServiceAmt() {
		return serviceAmt;
	}

	public void setServiceAmt(int serviceAmt) {
		this.serviceAmt = serviceAmt;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	
	
	

}
