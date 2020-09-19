package com.blakelong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach anotherCoach = context.getBean("tennisCoach", Coach.class);
		
		// test scope annotation
		System.out.println(theCoach == anotherCoach);
		System.out.println(theCoach);
		System.out.println(anotherCoach);
		
		// close context
		context.close();

	}

}