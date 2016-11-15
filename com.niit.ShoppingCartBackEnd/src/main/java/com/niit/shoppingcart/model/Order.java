package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Order {
	
	@Id
	private String id;
	private String Cart_id;
	private String Shipping_address;
	private String Billing_address;
	private String Payment_address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCart_id() {
		return Cart_id;
	}
	public void setCart_id(String cart_id) {
		Cart_id = cart_id;
	}
	public String getShipping_address() {
		return Shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		Shipping_address = shipping_address;
	}
	public String getBilling_address() {
		return Billing_address;
	}
	public void setBilling_address(String billing_address) {
		Billing_address = billing_address;
	}
	public String getPayment_address() {
		return Payment_address;
	}
	public void setPayment_address(String payment_address) {
		Payment_address = payment_address;
	}
	

}
