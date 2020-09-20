package com.blakelong.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private ArrayList<String> fortunesArrayList = new ArrayList<>();
	
	@PostConstruct
	@Override
	public String getFortune() {
		System.out.println("Executing after constructor and dependencies injected");
		try(BufferedReader br = new BufferedReader(new FileReader("fortunesFile.txt"))) {
		
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				fortunesArrayList.add(tempLine);
			}
		} catch (IOException e) {
			e.getMessage();
		}
		
		return fortunesArrayList.get(new Random().nextInt(fortunesArrayList.size()));
	}

}
