package com.springlearn.learn_spring.examples.a3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@Component
@Repository
 class MySQL implements DataService{

	@Override
	public int[] retrievedata() {
		
		return new int[] {1,2,3,4,5};
	}

}
