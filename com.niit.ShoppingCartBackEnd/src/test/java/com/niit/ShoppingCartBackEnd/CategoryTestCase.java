package com.niit.ShoppingCartBackEnd;




import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category category;
	
	@Autowired
	static CategoryDAO categoryDAO;
	
	@BeforeClass	
	public static void init(){
	    context=new AnnotationConfigApplicationContext();
	    context.scan("com.niit.shoppingcart");
	    context.refresh();
	    
	    categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	    category=(Category)context.getBean("category");
	     System.out.println("The object is created.");
	}
	
	@Test
	 public void createCategoryTestCase(){
		
	    category.setId("JOB_02");
		category.setName(" SEEEM-ENGINEER");
		category.setDescription("THIS TWO IS FOR YOU.");
		 
		 Boolean status=categoryDAO.save(category);
		 
		 Assert.assertEquals("Create Category Test Case",true,status);
	 }
	 @Test
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
    	  Assert.assertEquals("Get All category Test Case",3 ,categoryDAO.list().size());
     }
}
	 