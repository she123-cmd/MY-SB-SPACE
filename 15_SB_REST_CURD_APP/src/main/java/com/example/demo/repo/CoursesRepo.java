package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.Courses;

public interface CoursesRepo extends JpaRepository<Courses, Integer>{

}
