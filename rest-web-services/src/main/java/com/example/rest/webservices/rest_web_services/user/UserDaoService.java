package com.example.rest.webservices.rest_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService 
{
	
	private static List<User> users = new ArrayList<>();
	
	static
	{
		users.add(new User(1,"Alex",LocalDate.now().minusYears(27)));
		users.add(new User(2,"Bob",LocalDate.now().minusYears(28)));
		users.add(new User(3,"Carol",LocalDate.now().minusYears(29)));
	}
	
	public List<User> findAll()
	{
		return users;
	}
			
}
