package com.advjava.spring_aop.aopexample.dataservice;

import org.springframework.stereotype.Repository;

@Repository
public class DataService 
{
	
	public int[] retrieveData()
	{
		return new int[] {1,2,3,4,5};
	}

}
