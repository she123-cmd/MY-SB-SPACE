package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
