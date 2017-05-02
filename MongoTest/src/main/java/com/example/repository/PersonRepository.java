package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, Integer> {
	
	public Person findById(int id);
	public List<Person> findByCompany(String company);

}
