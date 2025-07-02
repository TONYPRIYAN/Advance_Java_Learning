package com.springlearn.learn_spring.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass
{
	
	Depen1 depen1;
	

	Depen2 depen2;
	
	
//@Autowired
public BusinessClass(Depen1 depen1, Depen2 depen2) {
		super();
		this.depen1 = depen1;
		this.depen2 = depen2;
	}



//	@Autowired
//	public void setDepen1(Depen1 depen1) {
//		this.depen1 = depen1;
//	}
//
//
//
//	@Autowired
//	public void setDepen2(Depen2 depen2) {
//		this.depen2 = depen2;
//	}




	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Using");
		sb.append(depen1);
		sb.append("and");
		sb.append(depen2);
		return sb.toString();
		
	}
	
}

@Component
class Depen1
{
	
}

@Component
class Depen2
{
	
}








@Configuration
@ComponentScan
public class DIGamingAppLauncher2 {
	
	public static void main(String[] args) 
	{
	
		try (var context = new AnnotationConfigApplicationContext(DIGamingAppLauncher2.class)) {
			//context.getBean(GamingConsole.class).right();
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.print(context.getBean(BusinessClass.class));
		}
		}
		
		
		
	}


