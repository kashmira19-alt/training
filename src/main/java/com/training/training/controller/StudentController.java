package com.training.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.training.entity.Student;
import com.training.training.service.StudentService;

@RestController
@RequestMapping("/add/api/students")
public class StudentController {
	public StudentController(){
		
	}
		@Autowired
		private StudentService studentService;

		@RequestMapping (method = RequestMethod.POST)
		public Student saveStudent(@RequestBody Student student)
		{
			return this.studentService.saveStudent(student);
		}
		
		
		
		@RequestMapping(value = "/add/api/students", method = RequestMethod.GET)  
		public com.training.training.entity.Student addStudent(@RequestParam("studentid") Long studentid, @RequestParam("studentmail") String studentmail, @RequestParam("studentname") String studentname)   
		{  
		return StudentService.createStudent(studentid, studentmail, studentname);  
		}  
		@RequestMapping(value = "/remove/api/students", method = RequestMethod.GET)  
		public String removeStudent( @RequestParam("studentmail") String studentmail)   
		{  
		StudentService.deleteStudent(studentmail);  
		return "Student removed";  
		}  
	 
		
	}
		