package com.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {

	/*
	 * If we use spring data rest, we need not to create the controllers,
	 * service layers. Spring-Data-Rest will give some endpoints for us.
	 * for all entities which have repository which extends JPARepository.
	 * those mappings are:
	 * 
	 * Example for employee entity :
	 * 
	 * GetMapping: employees
	 * GetMapping: employees/{id} 
	 * PostMapping: employees
	 * PutMapping: employees
	 * DeleteMapping: employees/{id} for all employee entity.
	 * 
	 * all this endpoints are created for all the entities which have 
	 * repository which extended JPARepository
	 */
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
}
