package com.blakelong.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// load spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);  
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach anotherTennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(tennisCoach.getDailyFortune());
		
		// call fields from properties file
//		System.out.println("Team Name: " + tennisCoach.getTeamName() + "\n" + 
//							"Team Colors: " + tennisCoach.getTeamColors());
		
		// check bean scope
		System.out.println(tennisCoach.hashCode());
		System.out.println(anotherTennisCoach.hashCode());
		
		// close the context
		context.close();

	}

}
