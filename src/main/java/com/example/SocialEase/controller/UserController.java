package com.example.SocialEase.controller; 

import com.example.SocialEase.model.User; 
import com.example.SocialEase.service.UserService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 

@RestController 
@RequestMapping("/api/users") 
public class UserController { 
	@Autowired 
	private UserService userService; 
	@PostMapping("/register") 
	public ResponseEntity<User> registerUser(@RequestBody User user) { 
		User savedUser = userService.register(user); 
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED); 
		} 
	}
