package com.capgemini.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("in constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min.";
	}
	

}
