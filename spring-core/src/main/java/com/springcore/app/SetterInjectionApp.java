package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class SetterInjectionApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Coach theCoach = context.getBean("crazyCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
