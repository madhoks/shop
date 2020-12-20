package com.arun.shop.controller;
import com.arun.shop.entity.*;

import com.arun.shop.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping
	public List<User> getUsers(){
		List<User> users=(List<User>)userRepository.findAll();
		return users;
	}


@PostMapping
public void saveUser(@RequestBody User user) {
userRepository.save(user);	
}
}