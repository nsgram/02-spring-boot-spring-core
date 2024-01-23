package com.capgemini.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
		System.out.println("in constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice 25min on backhand volley";
	}

}
