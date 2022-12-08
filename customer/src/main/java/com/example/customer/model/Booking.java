package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_tablee")
public class Booking {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column
	private String name;
	@Column
	private String modeOfPay;
	@Column
	private String carpenterAccNo;
	@Column
	private String carpenterIfscCode;
	@Column
	private int amt;
	@Column
	private String service;
	@Column
	private String refId;
	
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Booking(String id, String name, String modeOfPay, String carpenterAccNo, String carpenterIfscCode, int amt,
		String service,	String refId) {
		super();
		this.id = id;
		this.name = name;
		this.modeOfPay = modeOfPay;
		this.carpenterAccNo = carpenterAccNo;
		this.carpenterIfscCode = carpenterIfscCode;
		this.amt = amt;
		this.service=service;
		this.refId = refId;
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



	public String getModeOfPay() {
		return modeOfPay;
	}



	public void setModeOfPay(String modeOfPay) {
		this.modeOfPay = modeOfPay;
	}



	public String getCarpenterAccNo() {
		return carpenterAccNo;
	}



	public void setCarpenterAccNo(String carpenterAccNo) {
		this.carpenterAccNo = carpenterAccNo;
	}



	public String getCarpenterIfscCode() {
		return carpenterIfscCode;
	}



	public void setCarpenterIfscCode(String carpenterIfscCode) {
		this.carpenterIfscCode = carpenterIfscCode;
	}



	public int getAmt() {
		return amt;
	}



	public void setAmt(int amt) {
		this.amt = amt;
	}



	public String getRefId() {
		return refId;
	}



	public void setRefId(String refId) {
		this.refId = refId;
	}



	public String getService() {
		return service;
	}



	public void setService(String service) {
		this.service = service;
	}

     

		
	
	
	
 
}
