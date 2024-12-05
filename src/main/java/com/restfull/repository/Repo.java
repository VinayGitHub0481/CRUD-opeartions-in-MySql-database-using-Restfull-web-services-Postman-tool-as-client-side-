package com.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.restfull.entities.Courses;

@Repository
public interface Repo extends JpaRepository<Courses, Integer>{
	      
}
