package com.example.rest.webservices.rest_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	
	@GetMapping(path="/hallo")
	public String helloworld()
	{
		return "Hallo :-)";
	}
	
	@GetMapping(path="/hallo-Bean")
	public HelloWorldBean helloworldBean()
	{
		return new HelloWorldBean("Hallo :-)");
	}

}
