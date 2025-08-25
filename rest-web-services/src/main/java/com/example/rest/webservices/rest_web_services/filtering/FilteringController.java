package com.example.rest.webservices.rest_web_services.filtering;

import java.util.Arrays;
import java.util.List;

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
	
	@GetMapping("/filtering-list")
	public List<SomeBean> filteringList()
	{
		return Arrays.asList(new SomeBean("v1","v2","v3"),
				new SomeBean("v4","v5","v6"));
				
	}
	
	

}
