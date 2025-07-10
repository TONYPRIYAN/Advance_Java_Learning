package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringJPA.Springjpa.course.Course;
import com.SpringJPA.Springjpa.course.jpa.CourseJpaRepo;
import com.SpringJPA.Springjpa.course.springjpa.SpringJpaRepo;


@Component
public class CourseJpacmd implements CommandLineRunner
{
//	@Autowired
//	CourseJpaRepo repo;
	@Autowired
	private SpringJpaRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Course(1,"Spring-Boot","Tony"));
		repo.save(new Course(2,"DSA","Tony"));
		repo.save(new Course(3,"Apititude","Tony"));
		
		repo.deleteById(3l);
//		System.out.println(repo.findById(2l));
//		
//		System.out.println(repo.count());
		
		System.out.println(repo.findByAuthor("Tony"));
		System.out.println(repo.findByName("DSA"));
		
		
	}

}
