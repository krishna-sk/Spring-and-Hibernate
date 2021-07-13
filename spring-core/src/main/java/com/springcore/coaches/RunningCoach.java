package com.springcore.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

@Component
public class RunningCoach implements Coach {
	
	@Value("${user.email}")
	private String email;
	
	@Value("${user.team}")
	private String team;

	@Autowired
	private FortuneService fortuneService;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String getCoachName() {
		return "Running Coach";
	}

	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void startUpMethod() {
		System.out.println("Post Construct Method :: Running Coach");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Pre Destroy Method :: Runnig Coach");
	}

	
}
