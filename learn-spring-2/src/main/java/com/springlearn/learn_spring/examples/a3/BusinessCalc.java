package com.springlearn.learn_spring.examples.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

   
@Configuration
@ComponentScan
public class BusinessCalc
{
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(BusinessCalc.class)) {
			
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).findmax());
			
			
		}
		}
		
		
		
	}


