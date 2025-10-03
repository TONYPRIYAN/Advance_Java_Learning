package com.advjava.spring_aop.aopexample.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.advjava.spring_aop.aopexample.dataservice.DataService;


@Service
public class BusinessService 
{
	private DataService dataservice;
	
	
	
	public BusinessService(DataService dataservice) {
		this.dataservice = dataservice;
	}



	public int findMax()
	{
		int[] data = dataservice.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}

}
