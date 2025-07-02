package com.springlearn.learn_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	
		GamingConsole game;
	
	public GameRunner(@Qualifier("MarioQualifier") GamingConsole game)
	{
		this.game = game;
	}

	public void run() {
		System.out.println("Game Running" + game);
		game.down();
		game.left();
		game.right();
		game.up();
		
	}

}
