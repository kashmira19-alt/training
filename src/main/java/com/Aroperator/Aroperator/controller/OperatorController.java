package com.Aroperator.Aroperator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Aroperator.Aroperator.service.OperatorService;

@RestController
@RequestMapping("/api/home/")
public class OperatorController {

	public OperatorController() {

	}

	@Autowired
	public OperatorService operatorService;


	@RequestMapping(value = "sum", method = RequestMethod.GET)
	public Long sum(@RequestParam("v1") Long v1, @RequestParam("v2") Long v2) {

		return this.operatorService.sum(v1, v2);
	
	}
	@RequestMapping(value = "multi", method = RequestMethod.GET)
	public Long multi(@RequestParam("s1") Long s1, @RequestParam("s2") Long s2) {

		return this.operatorService.multi(s1, s2);
	
	}
	@RequestMapping(value = "div", method = RequestMethod.GET)
	public Long div(@RequestParam("d1") Long d1, @RequestParam("d2") Long d2) {

		return this.operatorService.div(d1, d2);
	
	}
}
