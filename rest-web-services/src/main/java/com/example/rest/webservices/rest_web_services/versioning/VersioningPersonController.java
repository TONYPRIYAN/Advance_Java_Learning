package com.example.rest.webservices.rest_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController 
{
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson()
	{
		return new PersonV1("Bruce Wayne");
		
	}

	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson()
	{
		return new PersonV2(new Name("Clark","Kent"));
		
	}
	
	@GetMapping(path="/person",params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequest()
	{
		return new PersonV1("Bruce Wayne");	
	}
	
	@GetMapping(path="/person",params = "version=2")
	public PersonV2 getSecondVersionOfPersonRequest()
	{
		return new PersonV2(new Name("Clark","Kent"));
		
	}
	
	
	

}
