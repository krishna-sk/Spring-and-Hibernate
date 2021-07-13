package com.springcore.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

/*
 * The Bean name by default will be the class-name with 1st letter lower-case.
 * If we specify the value inside the @Component then it will be the name
 * of the bean. Here the bean name will be crazyCoach  instead of cricketCoach
 * and default name won't work anymore.
 */

@Component("crazyCoach")
public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getCoachName() {
		return "Cricket Coach";
	}


	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}

}
