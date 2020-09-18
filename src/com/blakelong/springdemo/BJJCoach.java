package com.blakelong.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BJJCoach implements Coach {
	
	private FortuneService fortuneService;

	// define default constructor
	public BJJCoach() {
		System.out.println("Inside default BJJCoach constructor");
	}
	
	// setter injection example
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Practice open guard passing for one hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
