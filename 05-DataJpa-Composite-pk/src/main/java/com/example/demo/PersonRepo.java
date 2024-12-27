package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonPk;

public interface PersonRepo extends JpaRepository<Person, PersonPk> {

}
