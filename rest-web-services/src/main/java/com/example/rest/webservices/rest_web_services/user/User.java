package com.example.rest.webservices.rest_web_services.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User 
{
	@Size(min=2,message="Name should min 2")
	private String name;
	private Integer id;
	
	@Past(message="should be past")
	private LocalDate dob;
	
	
	
	
	
	public User(Integer id,String name, LocalDate dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", dob=" + dob + "]";
	}
	
	
	
	

}
