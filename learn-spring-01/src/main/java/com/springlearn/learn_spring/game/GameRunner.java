package com.springlearn.learn_spring.game;

public class GameRunner {
	
	//Mario game;
		GamingConsole game;
	
	public GameRunner(GamingConsole game)
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
