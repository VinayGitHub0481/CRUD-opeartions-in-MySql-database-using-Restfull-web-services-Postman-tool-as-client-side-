package com.restfull.service;
import java.util.List;
import com.restfull.entities.Courses;

public interface Service {

	public List<Courses> getCourses();
	public Courses  getSingleCourse(Integer id);
	public Courses createCourse(Courses course);
	public Courses modifyCourse(Courses course);
	 public void delete(Integer id);
}
