package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class HomeController {

	//@Autowired
	UserService userService;
	
	public HomeController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/home")
	public String home() {
		return "HW";
	}
	
	@GetMapping("/getAllUsers")
	public Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
}
