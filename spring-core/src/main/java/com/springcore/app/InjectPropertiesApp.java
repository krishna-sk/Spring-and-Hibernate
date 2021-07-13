package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.coaches.RunningCoach;
import com.springcore.config.SpringConfig;

public class InjectPropertiesApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		/*
		 * @PostConstruct : 
		 *           this will make a method to execute once the bean is created
		 * 
		 * @PreDestroy : 
		 *         this will make a method to execute before the bean is destroyed
		 * this method wont work for prototype scope
		 */
		
		RunningCoach theCoach = context.getBean("runningCoach", RunningCoach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
