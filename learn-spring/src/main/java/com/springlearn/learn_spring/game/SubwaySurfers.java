package com.springlearn.learn_spring.game;

public class SubwaySurfers implements GamingConsole
{

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Slide");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Switch Lane L");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Switch Lane R");
	}

}
