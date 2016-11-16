package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.UserRole;



public class UserRoleDAOImpl {

	@Repository("UserRoleDAO")
	public class UserRoleDAO{
		
		@Autowired
		SessionFactory  sessionFactory;
		
		public UserRoleDAO(SessionFactory sessionFactory)
		{
		this.sessionFactory=sessionFactory;	
		}
		
		@Transactional
		public boolean save (UserRole userRole){
			System.out.println("insideDAO");
			try {
				if(get(userRole.getId()) !=null){
					return false;
				}
				System.out.println(userRole.getAuthority());
				sessionFactory.getCurrentSession().save(userRole);
				return true;
			} catch (Exception e) {
				
				return false;
			}
			
			
		}
		@Transactional
		public boolean update(UserRole userRole){
			try {
				if (get(userRole.getId())==null){
				   return false;
				}
				System.out.println(userRole.getAuthority());
				sessionFactory.getCurrentSession().update(userRole);
				return true;
				
			} catch (Exception e) {
				
				return false;
			}
		}
		public boolean delete(UserRole userRole){
			try {
				if (get (userRole.getId())==null)
					return false;
				System.out.println(userRole.getAuthority());
				sessionFactory.getCurrentSession().delete(userRole);
				return true;
				
			} catch (Exception e) {
				
				return false;
			}
			
			
		}

			public UserRole get (String id){
				return(UserRole) sessionFactory.getCurrentSession().get(UserRole.class,id);
				
			}

			    public List<UserRole> list() {
			    	//select * from user
			    
			    	String hql="from userRole";
			    //we need to change hql into db specific query
			    
			    	Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		            return  query.list();
			}
			    

		

	}
}
