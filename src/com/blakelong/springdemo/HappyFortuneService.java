package com.blakelong.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public String getFortune() {
		return "Good fortune will find you soon";
	}
}
