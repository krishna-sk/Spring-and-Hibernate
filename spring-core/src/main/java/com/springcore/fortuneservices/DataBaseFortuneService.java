package com.springcore.fortuneservices;

import org.springframework.stereotype.Component;

import com.springcore.Interfaces.FortuneService;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is DataBase Fortune Service";
	}

}
