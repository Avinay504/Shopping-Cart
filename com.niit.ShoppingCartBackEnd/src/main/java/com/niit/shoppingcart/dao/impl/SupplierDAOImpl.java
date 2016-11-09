package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO{
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
    public boolean save(Supplier supplier) {
		
		if(get(supplier .getId())!=null);
		
		
		
		return false;
	}

	@Transactional
	public boolean update(Supplier supplier) {
		try {
	    	if (get (supplier.getId())!=null)
	    	{
	    		return false;
	    	}
	    	sessionFactory.openSession().save(supplier);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		try {
	    	if (get (supplier.getId())==null)
	    	{
	    		return false;
	    	}
	    	sessionFactory.openSession().delete(supplier);
		} catch (Exception e) {
			// TODO: handle exception
			return false;	
		}
		
	}

	@Transactional
	public Supplier get(String id) {
		
		return null;
	}

	@Transactional
	public List<Supplier> list() {
		
		return null;
	}
	
	

}
