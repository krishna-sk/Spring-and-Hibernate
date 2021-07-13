package com.springcore.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

/*  
 * Scope :: Singleton
 * By default scope will be singleton. Only one bean is generated and 
 * whenever we ask for a bean same bean reference will be provided.
*/

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	/* 
	 * @Qualifier :
	 * We may face issues while doing dependency injection, If we have more than 
	 * one implementation for our interface. In that case we use @Qualifier 
	 * annotation along with @Autowired annotation to specify which bean we want
	 * to use. 
	 */
	
	
	/*
	 * @Autowired is used on the top of the field to inject into the object
	 */
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getCoachName() {
		return "tennis Coach";
	}


	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}

}
