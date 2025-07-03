package com.springlearn.learn_spring.examples.cdi;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDILauncher {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(CDILauncher.class)) {
			//context.getBean(GamingConsole.class).right();
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		}
		
		
		
	}


