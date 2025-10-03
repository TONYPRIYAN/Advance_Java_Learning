package com.advjava.spring_aop.aopexample.business;

import java.util.Arrays;

import com.advjava.spring_aop.aopexample.dataservice.DataService;

public class BusinessService 
{
	private DataService dataservice;
	
	public int findMax()
	{
		int[] data = dataservice.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}

}
