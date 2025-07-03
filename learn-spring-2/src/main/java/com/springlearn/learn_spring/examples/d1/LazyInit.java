package com.springlearn.learn_spring.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class ClassA
{
	
}

@Component
class ClassB
{
	ClassA classa;

	public ClassB(ClassA classa) 
	{
		System.out.println("Running");
		
		this.classa = classa;
	}
	
	
	
	
	
}





@Configuration
@ComponentScan
public class LazyInit {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(LazyInit.class)) {
			//context.getBean(GamingConsole.class).right();
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		}
		}
		
		
		
	}


