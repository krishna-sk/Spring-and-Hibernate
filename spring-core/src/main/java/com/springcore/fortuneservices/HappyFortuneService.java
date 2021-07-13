package com.springcore.fortuneservices;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.FortuneService;

@Component
@Primary
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is Happy Fortune Service";
	}

}
