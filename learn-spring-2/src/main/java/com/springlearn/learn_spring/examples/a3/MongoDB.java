package com.springlearn.learn_spring.examples.a3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Primary
//@Component
@Repository
public class MongoDB implements DataService
{

	@Override
	public int[] retrievedata() {
		
		return new int[] {11,22,33,44,55};
	}

}
