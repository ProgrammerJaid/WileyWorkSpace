package com.demo.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull(message = "UserName cannot be empty.")
	@Size(min=1, message="Cannot be empty")
	private String username;

	@NotNull(message = "Password Cannot be empty.")
	@Size(min=8,message="must be 8 or greater")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
