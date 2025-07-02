package com.springlearn.learn_spring.examples.a3;

import java.util.Arrays;

import org.springframework.stereotype.Component;


@Component
public class BusinessService 
{
	
	DataService dataservice;
	
	
	public BusinessService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}


	public int findmax()
	{
		return Arrays.stream(dataservice.retrievedata()).max().orElse(0);

		}

}
