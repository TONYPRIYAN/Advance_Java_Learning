package com.springlearn.learn_spring.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springlearn.learn_spring.game")
public class GamingAppLauncher {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
			//context.getBean(GamingConsole.class).right();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
