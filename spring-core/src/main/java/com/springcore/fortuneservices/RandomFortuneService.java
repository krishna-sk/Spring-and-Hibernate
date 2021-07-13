package com.springcore.fortuneservices;

import org.springframework.stereotype.Component;

import com.springcore.Interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Random Fortune Service";
	}

}
