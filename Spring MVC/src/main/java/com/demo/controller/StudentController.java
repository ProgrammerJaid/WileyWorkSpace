package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/form")
	public String showForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "confirmation-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		System.out.println("First name: " + theStudent.getFirstName() + "last name: " + 
		theStudent.getLastName());

		return "student-confirmation";
	}
	
	
}
