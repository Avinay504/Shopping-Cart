package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;




@Entity
@Table(name="user")
@Component
public class User {
	
	@Id //@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	//@Size(min =4,max=25,message="Your Name must  be between 4-25 chracters.")
	private String Username;
	
	
	private String Contact;
	private String mail;
	
	//@NotNull(message="Please Select a password")
	//@Length(min=8,max=18,message="Password must contain at least chracter between 8-18.")
	
	//@Pattern(regexp=".+@.+\\+",message="Wrong Email Id!")
	private String password;
	private String Role;
	private Boolean Enabled;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		Username = Username;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Boolean getEnabled() {
		return Enabled;
	}
	public void setEnabled(Boolean enabled) {
		Enabled = enabled;
	}
	

}
