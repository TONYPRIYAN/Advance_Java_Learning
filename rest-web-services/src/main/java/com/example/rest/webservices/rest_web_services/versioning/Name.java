package com.example.rest.webservices.rest_web_services.versioning;

public class Name 
{
	private String firstName;
	private String LastName;
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	

}
