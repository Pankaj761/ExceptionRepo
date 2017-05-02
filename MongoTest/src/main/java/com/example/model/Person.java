package com.example.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Person {

	@Id
	int id;
	String name;
	String sex;
	int age;
	String company;

}
