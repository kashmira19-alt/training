package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.entity.Collage;
import com.training.training.service.CollageService;

@RestController
@RequestMapping("/api/collages")
public class CollageController {
	
	public CollageController() {
	}
	
	@Autowired
	private CollageService collageService;

	@RequestMapping (method = RequestMethod.POST)
	public Collage saveCollage(@RequestBody Collage collage)
	{
		return this.collageService.saveCollage(collage);
	}
}
