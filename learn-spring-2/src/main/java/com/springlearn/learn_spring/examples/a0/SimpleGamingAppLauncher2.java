package com.springlearn.learn_spring.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleGamingAppLauncher2 {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(SimpleGamingAppLauncher2.class)) {
			//context.getBean(GamingConsole.class).right();
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		}
		
		
		
	}


