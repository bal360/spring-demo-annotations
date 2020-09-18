package com.blakelong.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// spring will scan package and classes with @Component annotation will have bean registered with container
@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	// constructor injection
	// spring will scan components and look for one that implements the FortuneService interface
	// @Component annotation in HappyFortuneService will be found and that classes implementation will be used
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// setter injection example
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice serve for one hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
