package com.niit.ShoppingCartBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.UserRoleDAO;

import com.niit.shoppingcart.model.UserRole;

public class UserRoleTestCase {

	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static UserRole userRole;
	
	@Autowired
	static UserRoleDAO userRoleDAO;
	
	@BeforeClass	
	public static void init(){
	    context=new AnnotationConfigApplicationContext();
	    context.scan("com.niit.shoppingcart");
	    context.refresh();
	    
	    userRoleDAO=(UserRoleDAO)context.getBean("userRoleDAO");
	    userRole=(UserRole)context.getBean("userRole");
	     System.out.println("The object is created.");
	}
	
	@Test
	 public void createUserRoleTestCase(){
		
		 userRole.setId("abc");;
		 userRole.setAuthority("pvm");
		 
		
		 Boolean status=userRoleDAO.save(userRole);
		 
		 Assert.assertEquals("Create UserRole Test Case",true,status);
	 }
	 /*@Test
	 public void updateCategoryTestcase(){
		 
		 category.setId("JOB_03");
		 category.setName("MANSHI");
		 category.setDescription("HE LIVES IN BANGLADESH. ");
		 
		 Boolean status=categoryDAO.update(category); 
		 
		 Assert.assertEquals("Update Category Test case", true,status);
	 }
	 @Test
	 public void deleteCategoryTestCase(){
		 category.setId("JOB_01");
		 category.setName(" see-ENGINEER");
		 category.setDescription("THIS ONE IS FOR you.	");
		 
         Boolean status=categoryDAO.delete(category) ;
		 
		 Assert.assertEquals("Update Category Test case", true,status);
		 
	 }
     @Test
     public void getCategoryTestCase(){
    	 
    	 Assert.assertEquals("Get Category Test Case",null,categoryDAO.get("avi"));
    	 
     }
     @Test
     public void getAllCategoryTestCase(){
    	  Assert.assertEquals("Get All category Test Case",1 ,categoryDAO.list().size());
     }*/
}
	 
