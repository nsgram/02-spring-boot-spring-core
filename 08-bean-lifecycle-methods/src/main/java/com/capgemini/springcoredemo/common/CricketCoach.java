package com.capgemini.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("in constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min.";
	}
	//define our own init method
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println("in doMyStartStuff()::"+getClass().getSimpleName() );
	}
	
	//define our own destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("in doMyCleanupStuff()::"+getClass().getSimpleName() );
	}
	

}
