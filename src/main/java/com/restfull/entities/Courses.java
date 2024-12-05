package com.restfull.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Courses")
public class Courses {
    @Id
	private Integer id;
    @Column(name = "Course_Type")
	private String Course_name;
    @Column(name="Course_Fees")
	private Double Course_fees;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(Integer id, String course_name, Double course_fees) {
		super();
		this.id = id;
		Course_name = course_name;
		Course_fees = course_fees;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public Double getCourse_fees() {
		return Course_fees;
	}
	public void setCourse_fees(Double course_fees) {
		Course_fees = course_fees;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", Course_name=" + Course_name + ", Course_fees=" + Course_fees + "]";
	}	
}
