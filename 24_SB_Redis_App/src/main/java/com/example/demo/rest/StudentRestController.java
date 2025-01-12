package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@RestController
public class StudentRestController {
    
	@Autowired
	private StudentRepo srepo;
	
	@GetMapping("/students")
	public Iterable<Student> getAllStudents()
	{
		return srepo.findAll();
	}
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student)
	{
		srepo.save(student);
		return "student saved";
	}
}
