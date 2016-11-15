package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
    @Transactional
	public boolean save(Product product) {
    System.out.println("insideDAO save");
	    try {
	    	if (get (product.getId())!=null)
	    	{
	    		return false;
	    	}
	    	System.out.println(product.getPrice());
	    	sessionFactory.getCurrentSession().save(product);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean update(Product product) {
		try {
			if (get (product.getId())==null)
			{
				return false;
			}
		    sessionFactory.openSession().update(product);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean delete(Product product) {
		try {
			if (get (product.getId())==null)
			{
				return false;
			}
	    	sessionFactory.openSession().delete(product);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
    }
	public Product get (String id){
		return(Product) sessionFactory.openSession().get(Product.class,id);
		
	}

	    public List<Product> list() {
	    	//select * from category
	    
	    	String hql="from Product";
	    //we need to change hql into db specific query
	    
	    	Query query=(Query) sessionFactory.openSession().createQuery(hql);
            return  query.list();
	}
	    

		
		
}
	
	
	