package com.niit.ShoppingCartBackEnd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTestCase {

	//application context, SupplierDAO, supplier instance
           
	       @Autowired
	       static AnnotationConfigApplicationContext context;
	       
	       @Autowired
	       static SupplierDAO  supplierDAO;
	       
	       @Autowired
	       static Supplier supplier;
	       
	       @BeforeClass
	       public static void init()
	       {
	    	    context=new AnnotationConfigApplicationContext();
	    	    context.scan("com.niit.shoppingcartbackend");
	    	    context.refresh();
	    	    
	    	    supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	    	    supplier=(Supplier) context.getBean("supplier");
	    	   
	     }
	       
	     @Test
	  	 public void createSupplierTestCase(){
	  		
	  	    supplier.setId("JOB_01");
	  		supplier.setName("ASSIATANT ENGINEER");
	  		supplier.setDescription("THIS ONE IS FOR CSE.");
	  		 
	  		 Boolean status=supplierDAO.save(supplier);
	  		 
	  		 Assert.assertEquals("Create supplier Test Case",true,status);
	  	 }
	  	 @Test
	  	 public void updateSupplierTestcase(){
	  		 
	  		 supplier.setId("JOB_01");
	  		 supplier.setName("ravi");
	  		 supplier.setDescription("He lives in bengaluru ");
	  		 
	  		 Boolean status=supplierDAO.update(supplier); 
	  		 
	  		 Assert.assertEquals("Update Supplier Test case", true,status);
	  	 }
	  	@Test
	  	 public void deleteSupplierTestCase(){
	  		 supplier.setId("MOB_07");
	  		 supplier.setName("SAMSUNG");
	  		 supplier.setDescription("This is the best phone.");
	  		 
	           Boolean status=supplierDAO.delete(supplier) ;
	  		 
	  		 Assert.assertEquals("Update Supplier Test case", true,status);
	  		 
	  	 }
	     @Test
	       public void getSupplierTestCase(){
	      	 
	      	 Assert.assertEquals("Get Supplier Test Case",null,supplierDAO.get("avi"));
	      	 
	       }
	      @Test
	       public void getAllSupplierTestCase(){
	      	  Assert.assertEquals("Get All Supplier Test Case",1 ,supplierDAO.list().size());
	       }
	  }
	  	 


