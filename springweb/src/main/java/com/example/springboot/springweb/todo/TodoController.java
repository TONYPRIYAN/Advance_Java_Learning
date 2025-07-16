package com.example.springboot.springweb.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController 
{
	
	private TodoService todoserv;

	public TodoController(TodoService todoserv) {
		super();
		this.todoserv = todoserv;
	}
	
	
	@RequestMapping("list-todos")
	public String displayTodos()
	{
		List<Todo> todolist = todoserv.findByUsernames("Tony");
		return "todos";
	}

}
