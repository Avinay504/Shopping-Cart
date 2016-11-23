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
	    	    context.scan("com.niit.shoppingcart");
	    	    context.refresh();
	    	    
	    	    supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	    	    supplier=(Supplier) context.getBean("supplier");
	    	   
	     }
	       
	    @Test
	  	 public void createSupplierTestCase(){
	  		
	  	    supplier.setId("666");
	  		supplier.setName("222");
	  		supplier.setDescription("333");
	  		 
	  		 Boolean status=supplierDAO.save(supplier);
	  		 
	  		 Assert.assertEquals("Create supplier Test Case",true,status);
	  	 }
	  	 //not working
	  	@Test
	  	 public void updateSupplierTestcase(){
	  		 
	  		 supplier.setId("111");
	  		 supplier.setName("bb");
	  		 supplier.setDescription("He lives in bengalur ");
	  		 
	  		 Boolean status=supplierDAO.update(supplier); 
	  		 
	  		 Assert.assertEquals("Update Supplier Test case", true,status);
	  	 }
	  	@Test
	  	 public void deleteSupplierTestCase(){
	  		 supplier.setId("abc");
	  		 supplier.setName("def");
	  		 supplier.setDescription("ghi");
	  		 
	           Boolean status=supplierDAO.delete(supplier) ;
	  		 
	  		 Assert.assertEquals("Update Supplier Test case", true,status);
	  		 
	  	 }
	  	
	     @Test
	       public void getSupplierTestCase(){
	      	 
	      	 Assert.assertEquals("Get Supplier Test Case",null,supplierDAO.get("avi"));
	      	 
	       }
	      @Test
	       public void getAllSupplierTestCase(){
	      	  Assert.assertEquals("Get All Supplier Test Case",5 ,supplierDAO.list().size());
	       }
	  }
	  	 


