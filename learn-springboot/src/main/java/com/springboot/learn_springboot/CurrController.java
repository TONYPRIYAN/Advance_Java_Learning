package com.springboot.learn_springboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrController 
{
	@Autowired
	private CurrConfig config;
	
	@RequestMapping("/currency-configuration")
	public CurrConfig retrieve()
	{
		return config;
	}

}
