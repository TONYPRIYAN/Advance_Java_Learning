package com.springlearn.learn_spring.examples.cdi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named//@Component
class ClassA
{
	ClassB cls;

	

	public ClassB getCls() {
		System.out.println("Setter");
		return cls;
	}

	@Inject//@Autowired
	public void setCls(ClassB cls) 
	{
		
		this.cls = cls;
	}
	
	
}

@Named//@Component
class ClassB
{
	
	
	
}










@Configuration
@ComponentScan
public class CDILauncher {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(CDILauncher.class)) {
			//context.getBean(GamingConsole.class).right();
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
			
			
			System.out.print(context.getBean(ClassA.class).getCls());
			
		}
		}
		
		
		
	}


