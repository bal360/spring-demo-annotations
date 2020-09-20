package com.blakelong.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${team.name}")
	private String teamName;
	
	@Value("${team.colors}")
	private String teamColors;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public String getTeamColors() {
		return teamColors;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Kick the ball for awhile";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
