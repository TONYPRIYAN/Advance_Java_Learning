package com.example.rest.webservices.rest_web_services.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController 
{
	@GetMapping("/filtering")
	public SomeBean filtering()
	{
		return new SomeBean("v1","v2","v3");
	}

}
