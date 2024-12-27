package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmpRepo;
import com.example.demo.entity.Employee;

@Service
public class EmpService {
	
	private EmpRepo empRepo;

	public EmpService(EmpRepo repo) {
		this.empRepo = repo;
	}

	public void getAllEmps() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
	}
	
	public void getAllEmpsPagination()
	{
		int pagesize=3;    //Fixed value
		
		int pagenumber=1;  //get from UI in future
		
		PageRequest pg =PageRequest.of(pagenumber, pagesize);
		
		Page<Employee> page=empRepo.findAll(pg);
		
		List<Employee> emps=page.getContent();
		
		emps.forEach(e-> System.out.println(e));
		
	}
	
	public void getAllEmpsWithFilter() {

		Employee entity = new Employee(); 

		entity.setEname("shekhar");  //if name comes from UI
		
		Example<Employee> example = Example.of(entity);

		List<Employee> emps = empRepo.findAll(example);

		emps.forEach(e -> System.out.println(e));
	}
	
	
	public void getAllEmpssort() {
		
               Sort sort=Sort.by("esalary").ascending();
		 
		
		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(e -> System.out.println(e));
	}
	

}
