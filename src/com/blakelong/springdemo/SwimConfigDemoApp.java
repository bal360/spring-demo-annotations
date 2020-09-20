package com.blakelong.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		
		// load spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);  
		
		// get the bean from spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(swimCoach.getDailyFortune());
		
		// call fields from properties file
		System.out.println("Team Name: " + swimCoach.getTeamName() + "\n" + 
							"Team Colors: " + swimCoach.getTeamColors());
		
		// check bean scope
		
		// close the context
		context.close();

	}

}
