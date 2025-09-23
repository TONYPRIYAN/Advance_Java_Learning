package com.example.rest.webservices.rest_web_services.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConf
{
	 
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception
	{
		return http.build();
	}

}
