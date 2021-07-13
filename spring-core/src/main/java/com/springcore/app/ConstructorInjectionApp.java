package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class ConstructorInjectionApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		/*
		 * if a class, which is configured as a Spring bean, has only one constructor,
		 * the @Autowired annotation can be omitted and Spring will use that constructor
		 * and inject all necessary dependencies. @Autowired annotation can be omitted if
		 * a class which is configured as a Spring bean doesn't have default constructor.
		 */

		Coach theCoach = context.getBean("baseBallCoach", Coach.class);

		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());

		context.close();
	}

}
