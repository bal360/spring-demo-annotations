package com.blakelong.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

		public String getFortune() {
			String[] fortuneArray = {"Today is your lucky day!", 
									"I see good things in your future.",
									"Good luck is about to slug you in the face!"};
			int randomIndex = new Random().nextInt(fortuneArray.length);
			return fortuneArray[randomIndex];
		}
}
