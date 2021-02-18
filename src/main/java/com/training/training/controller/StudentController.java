package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.entity.Student;
import com.training.training.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	public StudentController() {
		
	}
		@Autowired
		private StudentService studentService;

		@RequestMapping (method = RequestMethod.POST)
		public Student saveStudent(@RequestBody Student student)
		{
			return this.studentService.saveStudent(student);
		}
	}
		