package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;



@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {
	
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
			System.out.println(user.getContact());
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
	
		}
		
		
	}
	@Transactional
	public boolean update(User user){
		try {
			System.out.println(user.getContact());
			sessionFactory.getCurrentSession().update(user);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
	
	@Transactional
	public boolean delete(User user){
		try {
            System.out.println(user.getContact());
			sessionFactory.getCurrentSession().delete(user);
			return true;
			} catch (Exception e) {
				e.printStackTrace();
			return false;
		}
		
		
	}
	@Transactional
	public User get (String id){
			return(User) sessionFactory.getCurrentSession().get(User.class,id);
			
		}
	@Transactional
     public List<User> list() {
		    	//select * from user
		    
		    	String hql="from User";
		    //we need to change hql into db specific query
		    
		    	Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
	            return  query.list();
		}
		    

	

}
