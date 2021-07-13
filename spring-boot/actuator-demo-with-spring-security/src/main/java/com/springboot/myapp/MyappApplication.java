package com.springboot.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyappApplication {
	
	/*
	 * We have included spring security in the pom.xml file. 
	 * So, if we try to access endpoints then it will redirect to login page
	 * default username  is "user" and  password  is generated when we start the 
	 * application by name "Using generated security password: "
	 * 
	 * If we want to customize username and password we can specify it in 
	 * application.properties by
	 * 
	 * spring.security.user : username
	 * spring.security.password : password
	 */

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
}
