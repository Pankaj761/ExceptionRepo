package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.repository.PersonRepository;

@RestController
public class ControllerRest {
	
	@Autowired 
	PersonRepository per;
	
	
	@PostMapping("/person")
	public ResponseEntity< Person> test(@RequestBody Person person)
	{
		System.out.println(person.toString());
		per.save(person);
		return new ResponseEntity(person,HttpStatus.OK);
	}
	
	@GetMapping("/findbyid/{id}")
	public Person getPerson(@PathVariable int id)
	{
		return per.findById(id);
	}
	
	@GetMapping("/findbycompany/{company}")
	public List<Person> getPerson(@PathVariable String company)
	{
		return per.findByCompany(company);
	}
	
	@GetMapping("/findall")
	public List<Person> findAll()
	{
		return per.findAll();
	}

}
