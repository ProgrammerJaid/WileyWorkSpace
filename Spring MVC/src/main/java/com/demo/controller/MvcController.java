package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

	
	@RequestMapping(value="form.htm",method=RequestMethod.GET)
	public ModelAndView welcome(){
		
		System.out.println("request received");
		String welcome_message="Welcome to the wonderful world of Books!!!";
		return new ModelAndView("form","message",welcome_message);
	}
	
	@RequestMapping(value = "process.htm", method = RequestMethod.POST)
	public ModelAndView processing(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("request received");
		if(request.getParameter("name").equals("Jaid") &&
				request.getParameter("password").equals("password")) {
			String welcome_message="Welcome to the wonderful world of Books!!!";
			return new ModelAndView("welcome","message",welcome_message);
		}
		
		return new ModelAndView("invalid","invalid_msg","User is not valid");
	}
	
	
}
