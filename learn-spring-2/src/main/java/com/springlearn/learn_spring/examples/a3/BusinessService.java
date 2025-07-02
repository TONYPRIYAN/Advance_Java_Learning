package com.springlearn.learn_spring.examples.a3;

import java.util.Arrays;

public class BusinessService 
{
	
	DataService dataservice;
	public int findmax()
	{
		return Arrays.stream(dataservice.retrievedata()).max().orElse(0);

		}

}
