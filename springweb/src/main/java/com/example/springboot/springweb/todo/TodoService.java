package com.example.springboot.springweb.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService 
{
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int todocount = 0;
	
	static
	{
		todos.add(new Todo(++todocount,"Tony","SpringBoot",LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++todocount,"Bruce","Core CS",LocalDate.now().plusMonths(1), false));
		todos.add(new Todo(++todocount,"Clark","DSA",LocalDate.now().plusMonths(2), false));
		
	}
	
	public List<Todo> findByUsernames(String name)
	{
		return todos;
	}
	
	public void addTodo(String usrname,String desc,LocalDate target,boolean done)
	{
		Todo todo  = new Todo(++todocount,usrname,desc,target,done);
		todos.add(todo);
		
	}
	
	public void deleteTodo(int id)
	{
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	public void updateTodo(int id)
	{
		
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		deleteTodo(todo.getId());
		todos.add(todo);
		
	}

}
