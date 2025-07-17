package com.example.springboot.springweb.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController 
{
	
	private TodoService todoserv;

	public TodoController(TodoService todoserv) {
		super();
		this.todoserv = todoserv;
	}
	
	
	
	@Override
	public String toString() {
		return "TodoController [todoserv=" + todoserv + "]";
	}



	@RequestMapping("list-todos")
	public String displayTodos(ModelMap map)
	{
		List<Todo> todolist = todoserv.findByUsernames("Tony");
		map.addAttribute("todolist", todolist);
		return "todos";
	}
	
	@RequestMapping(value="add-todos",method = RequestMethod.GET)
	public String showTodos()
	{
		
		return "todo";
	}
	
	@RequestMapping(value="add-todos",method = RequestMethod.POST)
	public String addTodos()
	{
		
		return "todos";
	}

}
