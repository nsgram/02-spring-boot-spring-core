package com.capgemini.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	//define private fields for dependency
	private Coach myCoach;
	private Coach anotherCoach;
	//Define constructor for dependency injection
	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach myCoach,
			@Qualifier("cricketCoach") Coach anotherCoach) {
		System.out.println("in constructor: "+getClass().getSimpleName());
		this.myCoach = myCoach;
		this.anotherCoach =anotherCoach;
	}
	//add "dailyworkout" endpoint
	@GetMapping("/dailyworkout")
	public String getDailyworkout() {
		return myCoach.getDailyWorkout();
	}
	//check bean scopes
	@GetMapping("/check")
	public String check() {
		return "camparing beans ::"+(myCoach == anotherCoach);
	}
}
