package com.training.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.training.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl () {
}
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}
}