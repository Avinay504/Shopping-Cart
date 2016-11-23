//working fine.//
package com.niit.ShoppingCartBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTestCase {

	//application context, ProductDAO, product instance
           
	       @Autowired
	       static AnnotationConfigApplicationContext context;
	       
	       
	       @Autowired
	       static Product product;
	       
	       @Autowired
	       static ProductDAO  productDAO;
	       
	       @BeforeClass
	       public static void init()
	       {
	    	    context=new AnnotationConfigApplicationContext();
	    	    context.scan("com.niit.shoppingcart");
	    	    context.refresh();
	    	    
	    	    productDAO=(ProductDAO)context.getBean("productDAO");
	    	    product=(Product) context.getBean("product");
	    	    System.out.println("The object is created.");
	    	   
	     }
	       
	   // @Test
	  	 public void createProductTestCase(){
	  		
	  	    product.setId("eee");
	  		product.setName("ddd");
	  		product.setPrice("Rs.999");
	  		 
	  		 Boolean status=productDAO.save(product);
	  		 
	  		 Assert.assertEquals("Create product Test Case",true,status);
	  	 }
	  	//@Test
	  	 public void updateProductTestcase(){
	  		 
	  		 product.setId("ccc");
	  		 product.setName("pretti");
	  		 product.setPrice("Rs.500");
	  		 
	  		 Boolean status=productDAO.update(product); 
	  		 
	  		 Assert.assertEquals("Update product Test case", true,status);
	  	 }
	  	//@Test
	  	 public void deleteProductTestCase(){
	  		 product.setId("aaa");
	  		 product.setName("pretti");
	  		 product.setPrice("Rs 500");
	  		 
	           Boolean status=productDAO.delete(product) ;
	  		 
	  		 Assert.assertEquals("Update Product Test case", true,status);
	  		 
	  	 }
	  	@Test
	     public void getCategoryTestCase(){
	    	 
	    	 Assert.assertEquals("Get Category Test Case",null,productDAO.get("avi"));
	      	 
	     }
	     @Test
	     public void getAllProductTestCase(){
	      	  Assert.assertEquals("Get All Product Test Case",2,productDAO.list().size());
	       }
	  }
	  	 


