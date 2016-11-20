/*package com.niit.ShoppingCartBackEnd;




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
		
	    category.setId("888");
		category.setName("888");
		category.setDescription("888");
		 
		 Boolean status=categoryDAO.save(category);
		 
		 Assert.assertEquals("Create Category Test Case",true,status);
	 }
	@Test
	 public void updateCategoryTestcase(){
		 
		 category.setId("555");
		 category.setName("666");
		 category.setDescription("666");
		 
		 Boolean status=categoryDAO.update(category); 
		 
		 Assert.assertEquals("Update Category Test case", true,status);
	 }
	@Test
	 public void deleteCategoryTestCase(){
		 category.setId("444");
		 category.setName("666");
		 category.setDescription("666");
		 
         Boolean status=categoryDAO.delete(category) ;
		 
		 Assert.assertEquals("Delete Category Test case", true,status);
		 
	 }
    @Test
     public void getCategoryTestCase(){
    	 
    	 Assert.assertEquals("Get Category Test Case",null,categoryDAO.get("avi"));
    	 
     }
     @Test
     public void getAllCategoryTestCase(){
    	  Assert.assertEquals("Get All category Test Case",3,categoryDAO.list().size());
     }
}*/
	 