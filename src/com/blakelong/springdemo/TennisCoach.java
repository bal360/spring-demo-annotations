package com.blakelong.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// spring will scan package and classes with @Component annotation will have bean registered with container
@Component
public class TennisCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice serve for one hour";
	}

}
