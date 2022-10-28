package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	Logger log = LoggerFactory.getLogger(DemoController.class);

	@Scheduled(fixedRate = 1000)
	public void repeater() {
		System.out.println("Repeating task....");
	}
	
	@GetMapping("/welcome/{name}")
	public String greeting(@PathVariable String name) {
		//LOGGER.info(name+" has entered the website.");
		log.debug("Request {}", name);
		String response = "Hi " + name + " Welcome.";
		log.debug("Response {}", response);
		return response;
	}
	
}
