package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo 
{
	
	private JdbcTemplate jdbctemp;
	
	public static String insert_query= 
			"""
			insert into course(id,name,author)
			values(2,'DSA','Tony');
			""";
	
	public void insert()
	{
		jdbctemp.update(insert_query);
	}
}
