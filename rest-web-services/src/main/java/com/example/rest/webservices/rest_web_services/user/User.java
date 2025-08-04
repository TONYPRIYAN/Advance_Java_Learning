package com.example.rest.webservices.rest_web_services.user;

import java.time.LocalDate;

public class User 
{
	private String name;
	private Integer id;
	private LocalDate dob;
	
	
	
	
	
	public User(String name, Integer id, LocalDate dob) {
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
