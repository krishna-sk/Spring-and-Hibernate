package com.springcore.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

@Component
public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseBallCoach() {
		
	}
	
	/*
	 * if a class, which is configured as a Spring bean, has only one constructor,
	 * the @Autowired annotation can be omitted and Spring will use that constructor
	 * and inject all necessary dependencies. @Autowired annotation can be omitted if
	 * a class which is configured as a Spring bean doesn't have default constructor.
	 */
	
	//constructor Injection
	@Autowired
	public BaseBallCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getCoachName() {
		return "Base Ball Coach";
	}


	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}

}
