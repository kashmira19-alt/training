package com.training.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.training.entity.Collage;

@Service
public class CollageServiceImpl implements CollageService {
	
	public CollageServiceImpl () {
	}
	@Autowired
	private CollageRepository CollageRepository;
	
	@Override
	public Collage saveCollage(Collage collage) {
		
		return this.CollageRepository.save(collage);
	}
}












	
		