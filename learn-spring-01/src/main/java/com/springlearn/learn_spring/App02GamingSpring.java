package com.springlearn.learn_spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.GamingConsole;
import com.springlearn.learn_spring.helloworld.HelloWorldConfig;

public class App02GamingSpring {

	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			//context.getBean(GamingConsole.class).right();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
