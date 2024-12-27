package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

    public boolean SaveStudent(Student s);
	
	public List<Student> getStudents();
}
