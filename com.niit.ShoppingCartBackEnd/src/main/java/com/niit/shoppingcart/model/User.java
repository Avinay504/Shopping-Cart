package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name="user")
@Component
public class User {
	
	@Id @GeneratedValue
	private String id;
	
	@NotEmpty(message="Enter the Name!")
	@Size(min =4,max=25,message="Your Name Length Should  be between 4-25 chracters!")
	private String Username;
	
	@NotEmpty(message="Contact Number should not be empty")
	private String Contact;
	
	@NotEmpty(message="Email should not be empty")
	@Pattern(regexp=".+@.+\\..+", message="Wrong email!")
	private String mail;
	
	
	@NotEmpty(message="Password should not be empty")
    @Length(min=5, max=10, message="Password should be between 4-15 charactes")
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
