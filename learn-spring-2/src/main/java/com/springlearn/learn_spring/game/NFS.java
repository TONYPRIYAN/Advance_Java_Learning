package com.springlearn.learn_spring.game;

import org.springframework.stereotype.Component;

@Component
public class NFS implements GamingConsole {
	
	public void up()
	{
		System.out.println("Accelrate");
	}
	public void down()
	{
		System.out.println("Brake");
	}
	public void left()
	{
		System.out.println("left");
	}
	public void right()
	{
		System.out.println("right");
	}

}
