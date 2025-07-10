package com.SpringJPA.Springjpa.course.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPA.Springjpa.course.Course;

public interface SpringJpaRepo extends JpaRepository<Course,Long>
{

	
}
