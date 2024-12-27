package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Person {

	   private String name;
	   
	   private String email;
	   
	   private String gender;
	   
	   @EmbeddedId
	   private PersonPk personpk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PersonPk getPersonpk() {
		return personpk;
	}

	public void setPersonpk(PersonPk personpk) {
		this.personpk = personpk;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", gender=" + gender + ", personpk=" + personpk + "]";
	}
	   
	   
}
