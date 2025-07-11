package com.example.springboot.springweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCont 
{
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello()
	{
		return "Hey Its Tony!";
		
	}

}
