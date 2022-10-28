package com.example.demo.model;

public class StudentDto {

	private int id;
	private String fullName;

	public StudentDto() {
	}

	public StudentDto(int id, String full_name) {
		this.id = id;
		this.fullName = full_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
