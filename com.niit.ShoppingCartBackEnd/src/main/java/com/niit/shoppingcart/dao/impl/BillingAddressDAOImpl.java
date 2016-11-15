package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;


@Repository("billingAddressDAO")
public class BillingAddressDAOImpl implements BillingAddressDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public BillingAddressDAOImpl(SessionFactory sessionFactory)
	
	{
	   this .sessionFactory=sessionFactory;
		
	}
	@Transactional
	public boolean save(BillingAddress billingaddress) {
		System.out.println("insideDAO save");
		
		try{
			System.out.println(BillingAddress.getAddress());
		}
		
		
		
		return false;
	}

	@Transactional
	public boolean update(BillingAddress billingaddress) {
		
		return false;
	}

	@Transactional
	public boolean delete(BillingAddress billingaddress) {
		
		return false;
	}

	@Transactional
	public BillingAddress get(String id) {
		
		return null;
	}

	@Transactional
	public List<BillingAddress> list() {
		
		return null;
	}
	
	

}
