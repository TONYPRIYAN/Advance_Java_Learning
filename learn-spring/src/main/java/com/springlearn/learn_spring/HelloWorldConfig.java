package com.springlearn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig 
{
	@Bean
	String name()
	{
		return "Its Tony";
	}

}
