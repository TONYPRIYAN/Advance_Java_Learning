package com.springlearn.learn_spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.GamingConsole;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.springlearn.learn_spring.game.Mario;

@Configuration
public class App02GamingSpring {
	
	@Bean
	public GamingConsole game()
	{
		var game = new Mario();
		return game;
	}
	
	@Bean
	public GameRunner gamerunner(GamingConsole game)
	{
		var gamerunner = new GameRunner(game);
		return gamerunner;
	}

	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(App02GamingSpring.class)) {
			//context.getBean(GamingConsole.class).right();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
