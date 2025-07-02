package com.springlearn.learn_spring;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.Mario;
import com.springlearn.learn_spring.game.NFS;
import com.springlearn.learn_spring.game.SubwaySurfers;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		//var game = new Mario();
		//var game = new NFS();
		var game = new SubwaySurfers();
		
		var gamerunner = new GameRunner(game);
		gamerunner.run();
		
		

	}

}
