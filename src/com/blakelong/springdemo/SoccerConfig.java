package com.blakelong.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.blakelong.springdemo")
@PropertySource("classpath:soccer.properties")
public class SoccerConfig {

	// create bean for WeatherFortune
	@Bean	
	public FortuneService weatherFortuneService() {
		return new WeatherFortuneService();
	}
	
	// create bean for SoccerCoach AND inject dependency
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(weatherFortuneService());
	}
		
		
}
