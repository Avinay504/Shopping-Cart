package com.niit.shoppingcart.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;


@Controller
public class Registrationcontroller {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("/register")
	public String Registrationmodel(Model model){
		
		User user =new User();
		model.addAttribute("User", user);
		return "register";
		
	}
	@RequestMapping(value="/register"  ,  method=RequestMethod.POST)
	public ModelAndView RegistrationForm(@Valid @ModelAttribute("User")User  user,BindingResult result){
	System.out.println("inside HomeController");
	
	
	if (result.hasErrors()){
		ModelAndView model=new ModelAndView("register");
		return model;
		
	}
	userdao.save(user);
	ModelAndView modelAndView=new ModelAndView("index");
	return modelAndView;
		
		
		
		
	}

}
