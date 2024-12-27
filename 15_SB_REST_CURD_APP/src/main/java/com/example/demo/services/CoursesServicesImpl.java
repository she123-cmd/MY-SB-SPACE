package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Courses;
import com.example.demo.repo.CoursesRepo;

@Service
public class CoursesServicesImpl implements CoursesServices {

	@Autowired
	private CoursesRepo coursesRepo;
	@Override
	public String upsert(Courses courses) {
		// TODO Auto-generated method stub
		coursesRepo.save(courses);
		return "Course Saved..";
	}

	@Override
	public Courses GetById(Integer cid) {
		// TODO Auto-generated method stub
		Optional<Courses> findById=coursesRepo.findById(cid);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Courses> GetAllCourses() {
		// TODO Auto-generated method stub
		return coursesRepo.findAll();
		
	}

	@Override
	public String DeleteById(Integer cid) {
		// TODO Auto-generated method stub
		if(coursesRepo.existsById(cid))
		{
		     coursesRepo.deleteById(cid);
		     return "delete Successfully...";
		}
		
		return "no record found";
	}

}
