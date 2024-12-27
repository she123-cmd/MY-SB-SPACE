package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public boolean SaveStudent(Student s) {
		// TODO Auto-generated method stub
		Student savedStudent=studentRepo.save(s);
		return savedStudent.getId()!=null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

}
