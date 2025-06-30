package com.springlearn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.*;

public class App02Spring {

	public static void main(String[] args) {
		
		var context  = new AnnotationConfigApplicationContext(HelloWorldConfig.class);		

	}

}
