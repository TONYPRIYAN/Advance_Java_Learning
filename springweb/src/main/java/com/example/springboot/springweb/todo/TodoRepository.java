package com.example.springboot.springweb.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>
{
	

	public List<Todo> findByUsrname(String usrname);
	

}
