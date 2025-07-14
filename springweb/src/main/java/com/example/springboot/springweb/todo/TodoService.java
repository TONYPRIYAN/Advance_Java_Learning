package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService 
{
	
	private static List<Todo> todos;
	
	static
	{
		todos.add(new Todo(1,"Tony","SpringBoot",LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(2,"Bruce","Core CS",LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(3,"Clark","DSA",LocalDate.now().plusMonths(2), false));
		
	}
	
	public List<Todo> findByUsernames(String name)
	{
		return todos;
	}

}
