package com.SpringJPA.Springjpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.SpringJPA.Springjpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CourseJpaRepo 
{
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Course course)
	{
		em.merge(course);
	}
	
	public Course find(long id)
	{
		return em.find(Course.class, id);
	}
	
	public void delete(long id)
	{
		 
		em.remove(em.find(Course.class, id));
	}
	
	

}
