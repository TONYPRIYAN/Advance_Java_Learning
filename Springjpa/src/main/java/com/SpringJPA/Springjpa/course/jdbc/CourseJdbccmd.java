package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringJPA.Springjpa.course.Course;


@Component
public class CourseJdbccmd implements CommandLineRunner
{
	@Autowired
	CourseJdbcRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.insert(new Course(1,"Spring-Boot","Tony"));
		repo.insert(new Course(2,"DSA","Tony"));
		repo.insert(new Course(3,"Apititude","Tony"));
		
		//repo.delete(3);
		System.out.println(repo.findId(2));
		
	}

}
