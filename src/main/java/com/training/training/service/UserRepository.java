package com.training.training.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.training.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}

