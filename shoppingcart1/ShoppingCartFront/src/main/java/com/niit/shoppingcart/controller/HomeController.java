package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
		@RequestMapping("/")
		public String getIndexPage(){
			
			return "index";
		}
		
		@RequestMapping("/cart")
		public String getCartPage(){
			
			return "cart";
		}
		
		@RequestMapping("/checkout")
		public String getCheckOutPage(){
			
			return "checkout";
		}
		
		@RequestMapping("/contact")
		public String getContactPage(){
			
			return "contact";
		}
		
		@RequestMapping("/products")
		public String getProductsPage(){
			
			return "products";
		}
		
		/*@RequestMapping("/register")
		public String getRegisterPage(){
			
			return "register";
		}*/
		
		@RequestMapping("/product_detail")
		public String getProduct_Detailpage (){
			
			return "product_detail";
		}
		
		
	}
