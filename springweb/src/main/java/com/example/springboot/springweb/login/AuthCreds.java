package com.example.springboot.springweb.login;

import org.springframework.stereotype.Service;

@Service
public class AuthCreds 
{
	
	public boolean auth(String name,String pwd)
	{
		boolean user = name.equalsIgnoreCase("BRUCE WAYNE");
		boolean pass = pwd.equalsIgnoreCase("BATMAN");
		
		return user && pass;
	}

}
