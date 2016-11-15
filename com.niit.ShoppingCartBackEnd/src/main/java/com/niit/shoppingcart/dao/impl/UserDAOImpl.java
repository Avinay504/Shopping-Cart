package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.User;



@Repository("UserDAO")
public class UserDAOImpl {
	
	@Autowired
	SessionFactory  sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
	this.sessionFactory=sessionFactory;	
	}
	
	@Transactional
	public boolean save (User user){
		System.out.println("insideDAO");
		try {
			if(get(user.getId()) !=null){
				return false;
			}
			System.out.println(user.getContact());
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			
			return false;
		}
		
		
	}
	@Transactional
	public boolean update(User user){
		try {
			if (get(user.getId())==null){
			   return false;
			}
			System.out.println(user.getContact());
			sessionFactory.openSession().update(user);
			return true;
			
		} catch (Exception e) {
			
			return false;
		}
	}
	public boolean delete(User user){
		try {
			if (get (user.getId())==null)
				return false;
			System.out.println(user.getContact());
			sessionFactory.openSession().delete(user);
			return true;
			
		} catch (Exception e) {
			
			return false;
		}
		
		
	}

		public User get (String id){
			return(User) sessionFactory.openSession().get(User.class,id);
			
		}

		    public List<User> list() {
		    	//select * from user
		    
		    	String hql="from Supplier";
		    //we need to change hql into db specific query
		    
		    	Query query=(Query) sessionFactory.openSession().createQuery(hql);
	            return  query.list();
		}
		    

	

}
