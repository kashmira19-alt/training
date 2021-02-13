package com.training.training.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

	public HomeServiceImpl() {
	}

	@Override
	public String welcome(String name) {
		String message = "Welcome " + name + "!";
		return message;
	}

	@Override
	public Long sum(Long v1, Long v2) {
		Long sum = v1 + v2;
		return sum;
	}

}
