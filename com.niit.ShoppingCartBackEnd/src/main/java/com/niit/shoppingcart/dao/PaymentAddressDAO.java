package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.PaymentMethod;

public interface PaymentAddressDAO {
	public boolean save(PaymentMethod paymentmethod);
	public boolean update(PaymentMethod paymentmethod);
	public boolean delete(PaymentMethod paymentmethod);
	
	public PaymentMethod  get (String id);
	
	public List<PaymentMethod >   list(); 

}
