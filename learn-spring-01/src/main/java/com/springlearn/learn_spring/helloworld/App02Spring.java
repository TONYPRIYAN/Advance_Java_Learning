package com.springlearn.learn_spring.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.*;

public class App02Spring {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
			//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("age"));
			System.out.println(context.getBean(Person.class));//By Type
			//System.out.println(context.getBean("batman"));//By Custom name
			//System.out.println(context.getBean("address"));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//To List All the Beans
//		Arrays.stream(context.getBeanDefinitionNames())
//		.forEach(System.out::println);
		

	}

}
