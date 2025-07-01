package com.springlearn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.*;

public class App02Spring {

	public static void main(String[] args) {
		
		var context  = new AnnotationConfigApplicationContext(HelloWorldConfig.class);	
		
		
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));//By Type
		//System.out.println(context.getBean("batman"));//By Custom name
		//System.out.println(context.getBean("address"));

	}

}
