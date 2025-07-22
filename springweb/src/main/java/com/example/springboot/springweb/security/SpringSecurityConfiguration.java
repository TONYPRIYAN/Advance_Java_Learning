package com.example.springboot.springweb.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration 
{
	@Bean
	public InMemoryUserDetailsManager createUserDetails()
	{
		
		UserDetails userDetails1 = createUser("TonyPriyan", "Stark");
		UserDetails userDetails2 = createUser("Tony", "Stark");

		return new InMemoryUserDetailsManager(userDetails1,userDetails2);
	}

	private UserDetails createUser(String username, String rawPassword) {
		UserDetails userDetails = User.withUsername(username)
		        .password(passwordEncoder().encode(rawPassword))
		        .roles("USER", "ADMIN")
		        .build();
		return userDetails;
	}

	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
