package com.springlearn.learn_spring;

import com.springlearn.learn_spring.game.GameRunner;
import com.springlearn.learn_spring.game.Mario;
import com.springlearn.learn_spring.game.NFS;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		//var mario = new Mario();
		var nfs = new NFS();
		
		var gamerunner = new GameRunner(nfs);
		gamerunner.run();
		
		

	}

}
