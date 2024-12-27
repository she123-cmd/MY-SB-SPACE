package com.example.demo.service;

import com.example.demo.repo.EmpRepositry;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;

@Service
public class EmpService {
	
	private EmpRepositry emprepo;
	
	


	
	
	
	public EmpService(EmpRepositry emprepo) {
		
		this.emprepo = emprepo;
	}




	public void saveEmps()
	{
		Employee e0=new Employee(201,"sohan",3345.00);
		
		
		Employee e1=new Employee(202,"mohan",334534.00);
	
		
		Employee e2=new Employee(203,"rohan",334545.00);
		
		
              List<Employee> emps =Arrays.asList(e0 , e1 , e2);
              
               emprepo.saveAll(emps);
               
               System.out.println("Records inserted");
	}
	
	public void saveEmployee()
	{
		Employee e =new Employee();
		e.setEid(103);
		e.setEname("Niksmolaj");
		e.setEsalary(40000.00);
		
		emprepo.save(e);
		
		System.out.println("Record Saved");
		
	}
			
	

}
