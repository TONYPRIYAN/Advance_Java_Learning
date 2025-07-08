package com.SpringJPA.Springjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo 
{
	
	@Autowired
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
