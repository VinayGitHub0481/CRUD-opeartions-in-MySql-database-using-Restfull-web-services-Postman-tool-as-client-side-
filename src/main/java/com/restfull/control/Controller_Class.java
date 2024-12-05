package com.restfull.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.restfull.entities.Courses;
import com.restfull.service.Service;

@RestController   //combination of @Controller and @ResponseBody
public class Controller_Class {
	
	@Autowired
	public Service service;  //interface which providing the Services
      
	 //get all courses (retrive all the resources)
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.service.getCourses();
	}
	
	//get a course(retreive one course based on id)
	@GetMapping("/courses/{id}")
	public Courses getSingleCourse(@PathVariable String id) {
		
		return  this.service.getSingleCourse(Integer.parseInt(id));
		//by this parsing process the String value will be read as Integer value.
	}
	
	//create a new course
	@PostMapping("/courses")
	public Courses create(@RequestBody Courses course1) {
   //requesting  Body from the client 
		
		return  this.service.createCourse(course1);
	}
	
	//modify the existing course
	@PutMapping("/courses") 
	public Courses modify(@RequestBody Courses course) {
		return this.service.modifyCourse(course);
	}
	
	//delete the existing course based on Id
	
	  @DeleteMapping("/courses/{courseId}") 
	  public ResponseEntity<HttpStatus> delete(@PathVariable String courseId) { 
		  try {
	  this.service.delete(Integer.parseInt(courseId)); 
	  return new ResponseEntity<HttpStatus>(HttpStatus.OK); 
	  //here responseEntity gives the response of the httpstatus 
	  } catch(Exception e)
	  { e.printStackTrace(); 
	  return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR); 
	  }
	 }

}
