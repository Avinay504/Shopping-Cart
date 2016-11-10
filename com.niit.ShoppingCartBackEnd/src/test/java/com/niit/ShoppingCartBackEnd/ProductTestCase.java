package com.niit.ShoppingCartBackEnd;

import org.junit.Assert;
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
	       static ProductDAO  productDAO;
	       
	       @Autowired
	       static Product product;
	       
	       
	       public static void init()
	       {
	    	    context=new AnnotationConfigApplicationContext();
	    	    context.scan("com.niit.shoppingcartbackend");
	    	    context.refresh();
	    	    
	    	    productDAO=(ProductDAO)context.getBean("supplier DAO");
	    	    product=(Product) context.getBean("product");
	    	   
	     }
	       
	     @Test
	  	 public void createProductTestCase(){
	  		
	  	    product.setId("JOB_01");
	  		product.setName("ASSIATANT ENGINEER");
	  		product.setPrice("");
	  		 
	  		 Boolean status=productDAO.save(product);
	  		 
	  		 Assert.assertEquals("Create product Test Case",true,status);
	  	 }
	  	 @Test
	  	 public void updateProductTestcase(){
	  		 
	  		 product.setGetId("JOB_01");
	  		 product.setGetName("ravi");
	  		 product.setGetDescription("He lives in bengaluru ");
	  		 
	  		 Boolean status=productDAO.update(product); 
	  		 
	  		 Assert.assertEquals("Update product Test case", true,status);
	  	 }
	  	 @Test
	  	 public void deleteProductTestCase(){
	  		 product.setGetId("MOB_07");
	  		 product.setGetName("SAMSUNG");
	  		 product.setGetDescription("This is the best phone.");
	  		 
	           Boolean status=productDAO.delete(product) ;
	  		 
	  		 Assert.assertEquals("Update Product Test case", true,status);
	  		 
	  	 }
	       @Test
	       public void getProductTestCase(){
	      	 
	      	 Assert.assertEquals("Get Product Test Case",null,productDAO.get("avi"));
	      	 
	       }
	       @Test
	       public void getAllProductTestCase(){
	      	  Assert.assertEquals("Get All Product Test Case",1 ,productDAO.list().size());
	       }
	  }
	  	 


