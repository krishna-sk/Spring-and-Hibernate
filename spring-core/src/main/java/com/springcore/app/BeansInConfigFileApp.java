package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class BeansInConfigFileApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
	/*
	 * The SwimCoach Bean is defined in the SpringConfig file.
	 * we haven't annotated with @Component and @Autowired for dependency. 
	 */
		
	/*
	 * To use this beans first we need to comment out the @ComponentScan in SpringConfig file
	 */
		
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());
		context.close();

	}

}
