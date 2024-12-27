package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Courses;
import com.example.demo.services.CoursesServices;

@RestController
public class CoursesController {
	
	@Autowired
	private CoursesServices coursesServices;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Courses courses)
	{
		String status=coursesServices.upsert(courses);
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Courses> getCourse(@PathVariable Integer cid)
	{
		Courses courses=coursesServices.GetById(cid);
		return new ResponseEntity<>(courses,HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Courses>> getAllCourses()
	{
		List<Courses> allCourses= coursesServices.GetAllCourses();
		return new ResponseEntity<>(allCourses,HttpStatus.OK);
	}
	
	@PutMapping("course")
	public ResponseEntity<String> updateourses(@RequestBody Courses courses)
	{
		String status=coursesServices.upsert(courses);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid)
	{
		String status=coursesServices.DeleteById(cid);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	

}
