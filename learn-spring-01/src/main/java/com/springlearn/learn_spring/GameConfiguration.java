package com.springlearn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.GamingConsole;
import com.springlearn.learn_spring.game.Mario;

@Configuration
public class GameConfiguration
{

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
	
	
}
