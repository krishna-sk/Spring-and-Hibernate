package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class BeanNameApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		/*
		 * The Bean name by default will be the class-name with 1st letter lower-case.
		 * If we specify the value inside the @Component then it will be the name
		 * of the bean. Here the bean name will be crazyCoach  instead of cricketCoach
		 * and default name won't work anymore.
		 */
		
		Coach theCoach = context.getBean("crazyCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());
		context.close();
	}

}
