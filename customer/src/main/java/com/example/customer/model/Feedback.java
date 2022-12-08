package com.example.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback_tablee")
public class Feedback {
	
	@Id
	private String id;
	@Column 
	private String refId;
	@Column
	private int rating;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String id, String refId, int rating) {
		super();
		this.id = id;
		this.refId = refId;
		this.rating = rating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	

}
