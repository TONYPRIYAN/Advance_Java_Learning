package com.advjava.spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.advjava.spring_aop.aopexample.business.BusinessService;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	private BusinessService bs;
	
	
	
	public SpringAopApplication(BusinessService bs) {
		
		this.bs = bs;
		
	}

	Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Value {}",bs.findMax());
		
		
	}

}
