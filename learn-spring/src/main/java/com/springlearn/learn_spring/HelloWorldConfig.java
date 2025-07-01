package com.springlearn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age) {}
record Address (String place,String city) {}

@Configuration
public class HelloWorldConfig 
{
	@Bean
	String name()
	{
		return "Its Tony";
	}
	
	
	@Bean
	int age()
	{
		return 21;
	}
	
	@Bean(name="batman")
	public Person person()
	{
		return new Person("Bruce",29);
	}
	
	@Bean
	public Address address()
	{
		return new Address("Wayne Mansion","Gotham");
	}
}
