package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.service.HomeService;

@RestController
@RequestMapping("/api/home/")
public class HomeController {

	public HomeController() {

	}

	@Autowired
	public HomeService homeService;

	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String welcome(@RequestParam("name") String name) {

		return this.homeService.welcome(name);
	}

	@RequestMapping(value = "good-bye", method = RequestMethod.GET)
	public String goodbye() {

		return "Good Bye";
	}

	@RequestMapping(value = "sum", method = RequestMethod.GET)
	public Long sum(@RequestParam("v1") Long v1, @RequestParam("v2") Long v2) {

		return this.homeService.sum(v1, v2);
	}
}
