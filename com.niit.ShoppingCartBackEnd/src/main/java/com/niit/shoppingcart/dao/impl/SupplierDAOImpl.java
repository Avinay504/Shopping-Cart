package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
    @Transactional
	public boolean save(Supplier supplier) {
    System.out.println("insideDAO save");
	    try {
	    	System.out.println(supplier.getDescription());
	    	sessionFactory.getCurrentSession().save(supplier);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean update(Supplier supplier) {
		try {
			System.out.println(supplier.getDescription());
		    sessionFactory.getCurrentSession().update(supplier);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean delete(Supplier supplier) {
		try {
			System.out.println(supplier.getDescription());
	    	sessionFactory.getCurrentSession().delete(supplier);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
    }
    @Transactional
	public Supplier get (String id){
		return(Supplier) sessionFactory.getCurrentSession().get(Supplier.class,id);
		
	}
  @Transactional
	    public List<Supplier> list() {
	    	//select * from category
	    
	    	String hql="from Supplier";
	    //we need to change hql into db specific query
	    
	    	Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
            return  query.list();
	}
	    

		
		
}
	
	
	