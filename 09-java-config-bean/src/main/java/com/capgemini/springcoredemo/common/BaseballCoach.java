package com.capgemini.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		System.out.println("in constructor: "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30min in batting practice";
	}

}
