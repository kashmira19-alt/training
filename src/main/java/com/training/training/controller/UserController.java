package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.entity.User;
import com.training.training.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	public UserController() {
	}
	
	@Autowired
	private UserService userService;

	@RequestMapping (method = RequestMethod.POST)
	public User saveUser(@RequestBody User user)
	{
		return this.userService.saveUser(user);
	}
}
