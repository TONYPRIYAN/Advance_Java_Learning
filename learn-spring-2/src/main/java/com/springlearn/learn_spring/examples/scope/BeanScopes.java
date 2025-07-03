package com.springlearn.learn_spring.examples.scope;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
class Normal
{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class Prototype
{
	
}


@Configuration
@ComponentScan
public class BeanScopes {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(BeanScopes.class)) {
			//context.getBean(GamingConsole.class).right();
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
			
			System.out.println(context.getBean(Normal.class));
			System.out.println(context.getBean(Normal.class));
			System.out.println(context.getBean(Normal.class));

			
			
			
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));
			System.out.println(context.getBean(Prototype.class));

		}
		}
		
		
		
	}


