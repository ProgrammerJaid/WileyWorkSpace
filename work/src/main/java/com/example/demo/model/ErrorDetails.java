package com.example.demo.model;

import java.util.Date;

public class ErrorDetails {

	private Date date;
	private String body;

	public ErrorDetails() {
	}

	public ErrorDetails(Date date, String body) {
		this.date = date;
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public String getBody() {
		return body;
	}

}
