package com.blakelong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		
		// get the bean from spring container
		TennisCoach tennisCoach = (TennisCoach)context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(tennisCoach.getDailyFortune());
		
		// call fields from properties file
		System.out.println("Team Name: " + tennisCoach.getTeamName() + "\n" + 
							"Team Colors: " + tennisCoach.getTeamColors());
		
		// close the context
		context.close();

	}

}
