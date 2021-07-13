package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class SingletonScopeApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		/*  
		 * Scope :: Singleton
		 * By default scope will be singleton. Only one bean is generated and 
		 * whenever we ask for a bean same bean reference will be provided.
		*/
		
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same Object : "+result);
		System.out.println("\nMeomory Allocation for theCoach : " +theCoach);
		System.out.println("\nMeomory Allocation for alphaCoach : " +alphaCoach);
		
		context.close();
	}

}
