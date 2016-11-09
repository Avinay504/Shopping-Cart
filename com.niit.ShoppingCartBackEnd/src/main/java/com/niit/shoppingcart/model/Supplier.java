package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	@Id
	private String getid;
	private String getName;
	private String getDescription;
	public String getGetId() {
		return getid;
	}
	public void setGetId(String getId) {
		this.getid = getId;
	}
	public String getGetName() {
		return getName;
	}
	public void setGetName(String getName) {
		this.getName = getName;
	}
	public String getGetDescription() {
		return getDescription;
	}
	public void setGetDescription(String getDescription) {
		this.getDescription = getDescription;
	}
	
	
	
	
	

}
