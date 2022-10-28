package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDto;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/StudentDtos")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/insert")
	public int insert() {
		return service.batchInsertWithPreparedStatements();
	}
	
}
