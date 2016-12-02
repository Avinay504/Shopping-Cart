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
		
	    userDAO=(UserDAO)context.getBean("UserDAO");
	    user=(User) context.getBean("user");   
		
	}
	@Test
	public void createUserTestCase(){
		user.setId("22");
		user.setUsername("radhe");
		user.setContact("9044502797");
		user.setMail("radhe@gmail.com");
		user.setPassword("pp");
		user.setRole("user");
		
		Boolean status=userDAO.save(user);
		Assert.assertEquals("Create User Test Case",true,status);
		
	}
	@Test
	public void deleteUsertestCase(){
		user.setId("2");
		user.setUsername("pavan");
		user.setContact("9044502797");
		user.setMail("shakti@123");
		user.setPassword("rav");
		user.setRole("jankar");
		
		Boolean status=userDAO.delete(user) ;
		Assert.assertEquals("Delete User Test Case",true ,status);
		
		
	}
	@Test
	public void updateUserTestCase(){
		user.setId("3");
		user.setUsername("pavan");
		user.setContact("9044502797");
		user.setMail("shakti@123");
		user.setPassword("rav");
		user.setRole("jankar");
		
		Boolean status=userDAO.update(user);
		Assert.assertEquals("Update User Test Case", true,status);
	}
	@Test
	public void getUserTestCase(){
		Assert.assertEquals("Get User Test Case", null,userDAO.get("avi"));
		
	}
	
	@Test
		public void getAllTestCase(){
			Assert.assertEquals("GetAllTest case", 3, userDAO.list().size());
		}
}