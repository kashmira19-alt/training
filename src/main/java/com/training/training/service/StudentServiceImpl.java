package com.training.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.training.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	public StudentServiceImpl(){
		
	}
		@Autowired
		private StudentRepository studentRepository;
		
		@Override
		public Student saveStudent(Student student) {
			return this.studentRepository.save(student);
		}
		
	}
