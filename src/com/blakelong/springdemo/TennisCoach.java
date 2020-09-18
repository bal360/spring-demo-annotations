package com.blakelong.springdemo;

import org.springframework.stereotype.Component;

// spring will scan package and classes with @Component annotation will have bean registered with container
@Component
public class TennisCoach implements Coach {


	@Override
	public String getDailyWorkout() {
		return "Practice serve for one hour";
	}

}
