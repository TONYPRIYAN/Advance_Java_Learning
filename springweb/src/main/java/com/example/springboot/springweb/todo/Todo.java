package com.example.springboot.springweb.todo;

import java.time.LocalDate;
public class Todo 
{
	
	private int id;
	private String usrname;
	private String desc;
	private LocalDate target;
	private boolean done;
	
	public Todo(int id, String usrname, String desc, LocalDate target, boolean done) {
		super();
		this.id = id;
		this.usrname = usrname;
		this.desc = desc;
		this.target = target;
		this.done = done;
	}

	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getTarget() {
		return target;
	}

	public void setTarget(LocalDate target) {
		this.target = target;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	@Override
	public String toString() {
	    return "Todo{" +
	            "id=" + id +
	            ", username='" + usrname + '\'' +
	            ", description='" + desc + '\'' +
	            ", targetDate=" + target +
	            ", done=" + done +
	            '}';
	}

	
	

}
