package com.springlearn.learn_spring.examples.prepost;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Primary
{
	Secondary sec;

	public Primary(Secondary sec) {
		super();
		this.sec = sec;
	}
	
	
	@PostConstruct
	public void initialize()
	{
		sec.printmsg();
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Cleaning");
	}
	
}

@Component
class Secondary
{

	public void printmsg() {
		System.out.println("Printing msg");
		
	}
	
}
@Configuration
@ComponentScan
public class PrePost {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(PrePost.class)) {
			//context.getBean(GamingConsole.class).right();
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
			
			
		}
		}
		
		
		
	}


