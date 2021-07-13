package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class QualifierApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		/* 
		 * @Qualifier :
		 * We may face issues while doing dependency injection, If we have more than 
		 * one implementation for our interface. In that case we use @Qualifier 
		 * annotation along with @Autowired annotation to specify which bean we want
		 * to use. 
		 */
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
