package com.training.training.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.training.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}



