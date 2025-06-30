package com.springlearn.learn_spring.game;

public class GameRunner {
	
	Mario game;
	
	public GameRunner(Mario game)
	{
		this.game = game;
	}

	public void run() {
		System.out.println("Game Running" + game);
		
	}

}
