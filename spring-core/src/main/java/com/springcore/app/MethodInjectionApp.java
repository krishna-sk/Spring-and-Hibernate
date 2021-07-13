package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class MethodInjectionApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		 /* Method Injection is nothing but we will write the @Autowired annotation 
	      * top of the method. 
	     */
		
		Coach theCoach = context.getBean("volleyBallCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
