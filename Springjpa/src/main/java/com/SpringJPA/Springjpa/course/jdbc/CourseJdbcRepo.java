package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	public static String select_query = 
			"""
		select from course
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
	
	public Course findId(long id)
	{
		return jdbctemp.queryForObject(select_query,
				new BeanPropertyRowMapper<>(Course.class),id);
		
		
	}
	
}
