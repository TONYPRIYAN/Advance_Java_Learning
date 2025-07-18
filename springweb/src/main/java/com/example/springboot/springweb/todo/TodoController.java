package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String showTodos(ModelMap map)
	{
		String user = (String) map.get("name");
		Todo todo = new Todo(0, user,"" , LocalDate.now().plusMonths(2), false);
		map.put("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todos",method = RequestMethod.POST)
	public String addTodos(ModelMap map,Todo todo)
	{
		String usrname = (String) map.get("name");
		todoserv.addTodo(usrname, todo.getDesc(), LocalDate.now().plusMonths(2), false);
		return "redirect:list-todos";
	}

}
