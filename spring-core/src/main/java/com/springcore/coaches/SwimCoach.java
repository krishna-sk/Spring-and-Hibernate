package com.springcore.coaches;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

public class SwimCoach implements Coach{
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getCoachName() {
		return "Swim Coach";
	}

	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}
	
}
