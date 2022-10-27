package com.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.demo.entity.User;

@Controller
@RequestMapping("/user")
@EnableWebMvc
public class UserController {

	@RequestMapping("/form")
	public String userForm(Model model) {
		
		User user = new User();
		
		model.addAttribute("user", user);
		return "user-form";
	}
	
	@RequestMapping("/checkform")
	public String confirmUser(@Valid @ModelAttribute("user") User user,BindingResult res) {
		
		if(res.hasErrors())
			return "user-form";
		
		System.out.println("Checking user with backEnd...with name:"+user.getUsername());
		
		return "user-page";
	}
	
}
