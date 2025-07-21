package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
		Todo todo = new Todo(0, user,"", LocalDate.now().plusMonths(2), false);
		map.put("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value="add-todos",method = RequestMethod.POST)
	public String addTodos(ModelMap map, @Valid Todo todo, BindingResult result)
	{
	    if (result.hasErrors()) {
	        return "todo"; 
	    }

	    String usrname = (String) map.get("name");
	    todoserv.addTodo(usrname, todo.getDesc(), todo.getTarget(), false);
	    return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id)
	{
		todoserv.deleteTodo(id);
		
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="update-todo",method = RequestMethod.GET)
	public String showupdateTodo(@RequestParam int id,ModelMap map)
	{
		Todo todo = todoserv.findById(id);
		map.addAttribute("todo",todo);
		//todoserv.updateTodo(id);
		
		return "todo";
	}
	
	@RequestMapping(value="update-todo",method = RequestMethod.POST)
	public String updateTodos(ModelMap map, @Valid Todo todo, BindingResult result)
	{
	    if (result.hasErrors()) {
	        return "todo"; 
	    }

	    String usrname = (String) map.get("name");
	    todo.setUsrname(usrname);
	    todoserv.updateTodo(todo);
	    return "redirect:list-todos";
	}


}
