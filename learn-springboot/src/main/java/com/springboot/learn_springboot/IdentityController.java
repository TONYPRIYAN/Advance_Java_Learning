package com.springboot.learn_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController 
{
	@RequestMapping("/identities")
	public List<Identity> retrieve()
	{
		return Arrays.asList
		(
				new Identity(1,"Bruce Wayne","Batman"),
				new Identity(2,"Clark Kent","Superman")
				
				);
	}

}
