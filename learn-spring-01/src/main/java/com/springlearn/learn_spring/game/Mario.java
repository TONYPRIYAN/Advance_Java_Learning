package com.springlearn.learn_spring.game;

public class Mario implements GamingConsole
{
	public void up()
	{
		System.out.println("Jump");
	}
	public void down()
	{
		System.out.println("Croutch");
	}
	public void left()
	{
		System.out.println("Forward");
	}
	public void right()
	{
		System.out.println("BackWard");
	}

}
