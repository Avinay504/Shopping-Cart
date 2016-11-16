package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.UserRole;



public interface UserRoleDAO {
	public boolean save(UserRole userRole);
	public boolean update(UserRole userRole);
	public boolean delete(UserRole userRole);
	
	public UserRole get (String id);
	
	public List<UserRole>  list(); 
}



