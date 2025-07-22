package com.example.springboot.springweb.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController
{
	
	private AuthCreds authCreds;
	
	
	
	public WelcomeController(AuthCreds authCreds) {
		super();
		this.authCreds = authCreds;
	}

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String welcomePage(ModelMap map)
	{
		map.put("name","Tony");
		return "welcome";
	}
	
	

}
