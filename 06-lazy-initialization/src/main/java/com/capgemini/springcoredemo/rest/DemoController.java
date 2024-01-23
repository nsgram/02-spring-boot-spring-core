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
	//Define constructor for dependency injection
	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
		System.out.println("in constructor: "+getClass().getSimpleName());
		this.myCoach = myCoach;
	}
	//add "dailyworkout" endpoint
	@GetMapping("/dailyworkout")
	public String getDailyworkout() {
		return myCoach.getDailyWorkout();
	}
	
}
