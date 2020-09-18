package com.blakelong.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BJJCoach implements Coach{
	
	public String getDailyWorkout() {
		return "Practice open guard passing for one hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
