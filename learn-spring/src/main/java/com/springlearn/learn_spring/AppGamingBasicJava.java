package com.springlearn.learn_spring;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.Mario;
import com.springlearn.learn_spring.game.NFS;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var game = new Mario();
		//var game = new NFS();
		
		var gamerunner = new GameRunner(game);
		gamerunner.run();
		
		

	}

}
