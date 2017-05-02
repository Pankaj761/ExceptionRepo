package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.controller.ControllerRest;

@SpringBootApplication
@Import(ControllerRest.class)
public class MongoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTestApplication.class, args);
	}
}
