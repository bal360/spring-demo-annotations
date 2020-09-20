package com.blakelong.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerConfigDemoApp {
	
	public static void main(String[] args) {
		// load spring container from config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoccerConfig.class);
		
		// get the bean from the spring container
		SoccerCoach coach = context.getBean("soccerCoach", SoccerCoach.class);
		
		// call methods on bean
		System.out.println("Daily Workout: " + coach.getDailyWorkout() + "\n");
		System.out.println("Daily Weather Fortune: " + coach.getDailyFortune() + "\n");
		
		// call methods to get field values from properties file
		System.out.println("Team Name: " + coach.getTeamName() + "\n");
		System.out.println("Team Colors: " + coach.getTeamColors() + "\n");
		
		// close context
		context.close();
	}
}
