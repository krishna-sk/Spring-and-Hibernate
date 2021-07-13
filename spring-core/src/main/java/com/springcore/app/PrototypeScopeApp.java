package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class PrototypeScopeApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		/*  
		 * Scope :: Prototype
		 * whenever we ask for a bean a new bean will be provided.
		 * 
		 * Note : For prototype scoped beans Spring doesn't call the destroy method.
		*/
		
		
		Coach theCoach = context.getBean("volleyBallCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("volleyBallCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same Object       : "+result);
		System.out.println("\nMeomory Allocation for theCoach   : " +theCoach);
		System.out.println("\nMeomory Allocation for alphaCoach : " +alphaCoach);
		
		context.close();
	}

}
