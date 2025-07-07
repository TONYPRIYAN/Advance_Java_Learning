package com.springboot.learn_springboot;

public class Identity 
{
	private int id;
	private String name;
	private String Sname;
	
	
	
	public Identity(int id, String name, String sname) {
		super();
		this.id = id;
		this.name = name;
		Sname = sname;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	
	
	@Override
	public String toString() {
		return "Identity [id=" + id + ", name=" + name + ", Sname=" + Sname + "]";
	}
	
	
	
	
	

}
