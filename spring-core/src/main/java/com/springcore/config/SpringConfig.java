package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;
import com.springcore.coaches.SwimCoach;
import com.springcore.fortuneservices.HappyFortuneService;

@Configuration
@ComponentScan("com.springcore")
@PropertySource("spring.properties")
public class SpringConfig {
	
	
	/*
	 * To use this beans we need to comment out the @ComponentScan
	 */
	
//	@Bean
//	public FortuneService happyFortuneService() {
//		return new HappyFortuneService();
//	}
//	
//	@Bean
//	public Coach swimCoach() {
//		SwimCoach swimCoach = new SwimCoach(happyFortuneService());
//		return swimCoach;
//	}
}
