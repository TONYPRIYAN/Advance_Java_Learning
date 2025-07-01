package com.springlearn.learn_spring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
//	@Primary
//	public Person person()
//	{
//		return new Person("Bruce",29,address());
//	}
	
	
	//Directly Calling using Methods
	@Bean
	@Primary
	public Person person()
	{
		return new Person(name(),age(),address1());
	}
	
	  
	//Passing Parameters
	@Bean
	//@Qualifier("p1")
	public Person person1(String name,int age,@Qualifier("a2") Address address)
	{
		return new Person(name,age,address);
	}
	
	@Bean
	@Qualifier("a2")
	public Address address1()
	{
		return new Address("Velapadi","Vellore");
	}
	@Bean
	@Qualifier("a1")
	public Address address()
	{
		return new Address("Wayne Mansion","Gotham");
	}
}
