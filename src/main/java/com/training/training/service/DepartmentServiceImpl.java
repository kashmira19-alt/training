package com.training.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.training.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	public DepartmentServiceImpl() {
		
	}
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return this.departmentRepository.save(department);
	}
	

}


