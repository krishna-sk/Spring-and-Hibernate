package com.springcore.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

@Component
public class BasketBallCoach implements Coach {
	/* 
	 * @Primary : If we have more than one implementation for a interface
	 * and we want to use a specific implementation class without using 
	 * @Qualifier then we need to declare that implementation class as
	 * @Primary.
	 * 
	 * If we don't use @Qualifier with @Autowired then the implementation
	 * class which is annotated with @Primary will be used for dependency
	 * injection
	 */
	
	/*
	 * Here we are not using @Qualifier, even though Fortune Service has many 
	 * implementation @Primary is used on Happy Fortune Service. So, happyFortuneService
	 * will be injected here.
	 */
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getCoachName() {
		return "BasketBall Coach";
	}


	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}

}
