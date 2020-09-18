package com.blakelong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach bJJCoach = context.getBean("BJJCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(bJJCoach.getDailyWorkout());
		
		
		// call method to get daily fortune
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
