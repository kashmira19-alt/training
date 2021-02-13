package com.training.training.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.training.entity.Collage;

@Repository
public interface CollageRepository extends JpaRepository<Collage, Long> {


}



