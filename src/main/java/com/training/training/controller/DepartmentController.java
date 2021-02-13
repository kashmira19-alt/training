package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.entity.Department;
import com.training.training.service.DepartmentService;


@RestController
@RequestMapping("/api/departments")

public class DepartmentController {
	public DepartmentController() {
	}
	
	
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping (method = RequestMethod.POST)
	public Department saveDepartment(@RequestBody Department department)
	{
		return this.departmentService.saveDepartment(department);
	}
}

