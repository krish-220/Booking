package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transferAmt_tbl")
public class TransferAmt {
	
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String bankName;
	@Column
	private String accNo;
	@Column 
	private String ifscCode;
	@Column
	private String service;
	@Column
	private int amt;
	public TransferAmt(String id, String name, String bankName, String accNo, String ifscCode, String service,int amt) {
		super();
		this.id = id;
		this.name = name;
		this.bankName = bankName;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.service=service;
		this.amt = amt;
	}
	public TransferAmt() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
	

}
