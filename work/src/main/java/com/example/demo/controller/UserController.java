package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo uRepo;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return (List<User>) uRepo.findAll();
	}
	
	@GetMapping("/users/{name}")
	public List<User> getUserByName(@PathVariable String name){
		return uRepo.findByFirstName(name);
	}
	
	@GetMapping("/any/{name}")
	public List<User> getAnyUser(@PathVariable String name){
		return uRepo.findByFirstNameOrLastNameAllIgnoreCase(name,name);
	}
	
	@GetMapping("/distinct/{name}")
	public List<User> getDistinctUser(@PathVariable String name){
		return uRepo.findDistinctUserByFirstNameOrLastNameOrderByLastNameAsc(name,name);
	}
	
	@GetMapping("/users/q")
	public List<User> getUsersQ(){
		return uRepo.getUsers();
	}
	
	@GetMapping("/users/like/{name}")
	public List<User> getUserLike(@PathVariable String name){
		return uRepo.findUserLike(name);
	}
	
	@GetMapping("/users/id/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id){
		Optional<User> user = uRepo.findById(id);
		if(!user.isPresent())
			throw new UserNotFoundException("User does not exists.");
		return new ResponseEntity<User>(user.get(),HttpStatus.OK);
	}
	
	
}
