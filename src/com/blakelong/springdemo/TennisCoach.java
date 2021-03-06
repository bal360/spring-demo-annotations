package com.blakelong.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// spring will scan package and classes with @Component annotation will have bean registered with container
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// ** field injection
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	// properties fields
	@Value("${team.colors}")
	private String colors;
	
	@Value("${team.name}")
	private String teamName;
	
	public TennisCoach() {
		System.out.println("inside default TennisCoach constructor for diagnostic purposes");
	}
	
	@PostConstruct
	public void executeUponInit() {
		System.out.println("Starting up");
	}
	
	// ** constructor injection
	// spring will scan components and look for one that implements the FortuneService interface
	// @Component annotation in HappyFortuneService will be found and that classes implementation will be used
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	// ** setter injection example
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public String getTeamColors() {
		return colors;
	}
	
	public String getTeamName() {
		return teamName;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice serve for one hour";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void executeUponClose() {
		System.out.println("Closing down");
	}

}
