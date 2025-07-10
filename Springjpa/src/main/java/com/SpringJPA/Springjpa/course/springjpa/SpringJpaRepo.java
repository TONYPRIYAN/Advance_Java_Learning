package com.SpringJPA.Springjpa.course.springjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Springjpa.course.Course;

public interface SpringJpaRepo extends JpaRepository<Course,Long>
{

	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
}

