package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringJPA.Springjpa.course.Course;

@Repository
public class CourseJdbcRepo 
{
	
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public static String insert_query= 
			"""
			insert into course(id,name,author)
			values(?,?,?);
			""";
	
	public static String delete_query = 
			"""
		delete from course 
		where id = ?;
			""";
	
	
	public void insert(Course course)
	{
		jdbctemp.update(insert_query,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id)
	{
		jdbctemp.update(delete_query,id);
	}
	
}
