package com.example.springboot.springweb.login;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.LoggerFactory;

@Controller
public class LoginController
{
	Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("login")
	public String Login(@RequestParam String name,ModelMap map)
	{
		
		map.put("name", name);
		logger.debug("This is Logger printing");
		return "login";
	}

}
