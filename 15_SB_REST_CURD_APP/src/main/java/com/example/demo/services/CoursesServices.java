package com.example.demo.services;

import java.util.List;

import com.example.demo.binding.Courses;

public interface CoursesServices {

	public String upsert(Courses courses);
	
	public Courses GetById(Integer cid);
	
	public List<Courses> GetAllCourses();
	
	public String DeleteById(Integer cid);
}
