package com.springcore.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springcore.Interfaces.Coach;
import com.springcore.Interfaces.FortuneService;

/*  
 * Scope :: Prototype
 * whenever we ask for a bean a new bean will be provided.
 * 
 * Note : For prototype scoped beans Spring doesn't call the destroy method.
*/

@Component
@Scope("prototype")
public class VolleyBallCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	/* Method Injection is nothing but we will write the @Autowired annotation 
     * top of the method. 
    */
	
	@Autowired
	@Qualifier("dataBaseFortuneService")
	public void commonMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getCoachName() {
		return "VolleyBall Coach";
	}


	@Override
	public String getFortuneName() {
		return fortuneService.getFortune();
	}

}
