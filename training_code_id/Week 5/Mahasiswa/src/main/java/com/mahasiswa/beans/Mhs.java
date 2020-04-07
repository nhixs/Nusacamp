package com.mahasiswa.beans;

//This is Bean or model or POJO(Plain Old Java Model)
public class Mhs {
	
	private int id;
	private String 	Name;
	private String Email;
	private String Course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		this.Course = course;
	}
	
	

}
