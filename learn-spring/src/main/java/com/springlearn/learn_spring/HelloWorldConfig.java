package com.springlearn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age,Address address) {}
record Address (String place,String city) {}

@Configuration
public class HelloWorldConfig 
{
	@Bean
	String name()
	{
		return "Tony";
	}
	
	
	@Bean
	int age()
	{
		return 21;
	}
	
//	@Bean(name="batman")
//	public Person person()
//	{
//		return new Person("Bruce",29);
//	}
	
	
	//Directly Calling using Methods
//	@Bean
//	public Person person()
//	{
//		return new Person(name(),age(),address());
//	}
	
	  
	//Passing Parameters
	@Bean
	public Person person(String name,int age,Address address)
	{
		return new Person(name,age,address);
	}
	
	
	@Bean
	public Address address()
	{
		return new Address("Wayne Mansion","Gotham");
	}
}
