package com.springlearn.learn_spring;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.Mario;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var mario = new Mario();
		var gamerunner = new GameRunner(mario);
		gamerunner.run();
		
		

	}

}
