package com.example.springboot.springweb.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
	
	private AuthCreds authCreds;
	
	
	
	public LoginController(AuthCreds authCreds) {
		super();
		this.authCreds = authCreds;
	}

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String Login()
	{
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String welcome(@RequestParam String name,@RequestParam String pwd,ModelMap map)
	{
		if(authCreds.auth(name, pwd))
		{
			map.put("name",name);
			map.put("pwd", pwd);
			return "welcome";
		}
		return "login";
		
	}

}
