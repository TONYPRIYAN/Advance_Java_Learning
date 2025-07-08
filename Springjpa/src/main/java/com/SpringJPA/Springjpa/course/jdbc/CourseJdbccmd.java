package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbccmd implements CommandLineRunner
{
	@Autowired
	CourseJdbcRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.insert();
		
	}

}
