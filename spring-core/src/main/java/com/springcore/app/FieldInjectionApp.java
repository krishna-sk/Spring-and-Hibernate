package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class FieldInjectionApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		/*
		 * @Autowired is used on the top of the field to inject into the object
		 */
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
