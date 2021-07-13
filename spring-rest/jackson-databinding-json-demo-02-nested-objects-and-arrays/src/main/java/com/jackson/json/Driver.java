package com.jackson.json;

import java.io.File;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON  file and map/convert to Java POJO: 
			// data/sample-lite.json
			
			Student theStudent = mapper.readValue(
						new File("src/main/resources/data/sample-full.json"), Student.class);
			
			// print student properties
			System.out.println("First name = " + theStudent.getFirstName());
			System.out.println("Last name = " + theStudent.getLastName());
			System.out.println(Arrays.toString(theStudent.getLanguages()));
			System.out.println(theStudent.getAddress());
			
			//print the student
			System.out.println(theStudent);
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}




