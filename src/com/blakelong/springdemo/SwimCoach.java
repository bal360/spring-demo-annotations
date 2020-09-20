package com.blakelong.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${team.colors}")
	private String teamColors;
	
	@Value("${team.name}")
	private String teamName;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getTeamColors() {
		return teamColors;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice freestyle for one hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
