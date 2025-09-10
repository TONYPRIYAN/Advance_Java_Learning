package com.example.rest.webservices.rest_web_services.user;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;


@Entity(name = "user_details")
public class User 
{
	
	protected User()
	{
		
	}
	@Size(min=2,message="Name should min 2")
	@JsonProperty("user_name")
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Past(message="should be past")
	@JsonProperty("BirthDate")
	private LocalDate dob;
	
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	List<Post> user;
	
	
	
	
	
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
