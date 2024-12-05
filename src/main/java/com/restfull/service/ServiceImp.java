package com.restfull.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.restfull.entities.Courses;
import com.restfull.repository.Repo;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {
	
	@Autowired
	private Repo repo;
       
	public ServiceImp() {
	}
	 
	@Override
	public List<Courses> getCourses() { //retrieving all the Courses
		
		return this.repo.findAll();
	}
	//here list of Courses will be returns to the RestController layer.

	@Override
	public Courses getSingleCourse(Integer id) {
			return this.repo.getReferenceById(id);
	}

	@Override
	public Courses createCourse(Courses course) {
		return this.repo.save(course);
	}

	@Override
	public Courses modifyCourse(Courses course) {
		return this.repo.save(course);
	}
	
	  @Override
	  public void delete(Integer id) {
		          Courses cc=repo.getReferenceById(id);  //here id will be Obtained
		     this.repo.delete(cc);  //if id is present then delete that specific course
	  }
	 

}
