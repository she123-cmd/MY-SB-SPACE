package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PersonRepo;
import com.example.demo.entity.Person;
import com.example.demo.entity.PersonPk;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	public void getPerson()
	{
        PersonPk pks =new PersonPk();
		
		pks.setPersonId(101);
		pks.setPassPortNum("Gwqreuy133");
		
               Optional<Person> findbyid =personRepo.findById(pks);
               
               if(findbyid.isPresent())
               {
            	   Person p=findbyid.get();
            	   System.out.println(p);
            	   
            	   
               }
	}
	
	public void savePerson()
	{
		PersonPk pks =new PersonPk();
		
		pks.setPersonId(101);
		pks.setPassPortNum("Gwqreuy133");
		
		
		Person p = new Person();
	    p.setName("Nikhil");
	    p.setEmail("shekharmolaj2044@gmail.com");
	    p.setGender("male");
		
	    //setting primery keys
	    p.setPersonpk(pks);
	    
	    personRepo.save(p);
	    
	    System.out.println("person saved...");
	    
	}
}
