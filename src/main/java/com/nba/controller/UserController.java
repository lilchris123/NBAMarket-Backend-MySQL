package com.nba.controller;

import java.io.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nba.dto.UserDTO;
import com.nba.model.User;
import com.nba.service.JwtUserDetailsService;
import com.nba.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@GetMapping("/users")
	private List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{username}")
	private User getUser(@PathVariable String username) {
		return userService.getUser(username);
	}
	
	@PostMapping("/users")
	private void createUser(@RequestBody UserDTO user) {
		userDetailsService.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	private void  deleteUser(@PathVariable int id) throws IOException {
		userService.deleteUser(id);
	}
}
