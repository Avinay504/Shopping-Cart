package com.niit.ShoppingCartBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTestCase {
	
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static User user;
	
	@Autowired
	static UserDAO userDAO;
	
	
    @BeforeClass
	public static  void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
	    userDAO=(UserDAO)context.getBean("userDAO");
	    user=(User) context.getBean("user");   
		
	}
	@Test
	public void createUserTestCase(){
		user.setId("JOB_09");
		user.setName("bhavish");
		user.setContact("jaynagar");
		user.setMail("avinay504");
		user.setPassword("sa");
		user.setRole("sflz");
		
		Boolean status=userDAO.save(user);
		Assert.assertEquals("Create User Test Case",true,status);
		
	}
	@Test
	public void deleteUsertestCase(){
		user.setId("bob_01");
		user.setName("prabhu");
		user.setContact("mahanagar");
		user.setMail("prabhu@123");
		user.setPassword("889");
		user.setRole("actor");
		
		Boolean status=userDAO.delete(user) ;
		Assert.assertEquals("Delete User Test Case",true ,status);
		
		
	}
	@Test
	public void updateUserTestCase(){
		user.setId("mao_02");
		user.setName("ravi");
		user.setContact("jpnagar");
		user.setMail("ravi@123");
		user.setPassword("sav");
		user.setRole("weaber");
		
		Boolean status=userDAO.update(user);
		Assert.assertEquals("Update User Test Case", true,status);
	}
	@Test
	public void getUserTestCase(){
		Assert.assertEquals("Get User Test Case", null,userDAO.get("avi"));
		
	}
	@Test
	public void getAllUserTestCase(){
		Assert.assertEquals("Get All User Test Cases",3,userDAO.list().size());
	}

}
