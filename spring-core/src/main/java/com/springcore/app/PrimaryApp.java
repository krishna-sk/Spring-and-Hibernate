package com.springcore.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.Interfaces.Coach;
import com.springcore.config.SpringConfig;

public class PrimaryApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		/* @Primary : If we have more than one implementation for a interface
		 * and we want to use a specific implementation class without using 
		 * @Qualifier then we need to declare that implementation class as
		 * @Primary.
		 * 
		 * If we don't use @Qualifier with @Autowired then the implementation
		 * class which is annotated with @Primary will be used for dependency
		 * injection
		 */
		
		Coach theCoach = context.getBean("basketBallCoach", Coach.class);
		
		System.out.println(theCoach.getCoachName());
		
		System.out.println(theCoach.getFortuneName());
		
		context.close();
	}

}
