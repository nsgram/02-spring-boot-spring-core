package com.capgemini.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springcoredemo.common.Coach;

@RestController
public class DemoController {
	
	//define private fields for dependency
	private Coach myCoach;
	//Define constructor for dependency injection
	@Autowired
	public void setCoach(Coach myCoach) {
		this.myCoach = myCoach;
	}
	//add "dailyworkout" endpoint
	@GetMapping("/dailyworkout")
	public String getDailyworkout() {
		return myCoach.getDailyWorkout();
	}
	
}
