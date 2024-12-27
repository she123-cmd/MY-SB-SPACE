package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
     
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public ModelAndView getForm()
	{
		ModelAndView mav =new ModelAndView();
		mav.addObject("sobj", new Student());
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/student")
	public ModelAndView saveStudent(Student sobj)
	{
		ModelAndView mav=new ModelAndView();
		Boolean status=studentService.SaveStudent(sobj);
		
		if(status)
		{
			mav.addObject("smsg", "Student saved...");
		}
		else
		{
			mav.addObject("emsg", "failed to save....");
		}
		mav.addObject("sobj", new Student());
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/students")
	public ModelAndView getStudents()
	{
		ModelAndView mav=new ModelAndView();
		   List<Student>studentList=studentService.getStudents();
		   mav.addObject("slist", studentList);
		   mav.setViewName("data");
		   return mav;
	}
	
	
	
	
	
	
	
}
