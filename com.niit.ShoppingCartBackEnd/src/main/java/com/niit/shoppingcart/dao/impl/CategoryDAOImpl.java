package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
    @Transactional
	public boolean save(Category category) {
    System.out.println("insideDAO save");
	    try {
	    	System.out.println(category.getDescription());
	    	sessionFactory.getCurrentSession().save(category);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean update(Category category) {
    	System.out.println("insideDAO ");
    	
		try {
			System.out.println(category.getDescription());
		    sessionFactory.getCurrentSession().update(category);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
	}
    @Transactional
	public boolean delete(Category category) {
		try {
			System.out.println(category.getDescription());
	    	sessionFactory.getCurrentSession().delete(category);
             return true;
		} catch (HibernateException e) {
			// TODO Auto-generated method stub
			e.printStackTrace();
			return false;
			
		}
    }
    @Transactional
	public Category get (String id){
		return(Category) sessionFactory.getCurrentSession().get(Category.class,id);
		
	}
    @Transactional
	    public List<Category> list() {
	    	//select * from category
	    
	    	String hql="from Category";
	    //we need to change hql into db specific query
	    
	    	Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
            return  query.list();
	}
	    

		
		
}
	
	
	