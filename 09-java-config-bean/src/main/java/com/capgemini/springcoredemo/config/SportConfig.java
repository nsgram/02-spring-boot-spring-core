package com.capgemini.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcoredemo.common.Coach;
import com.capgemini.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean
	
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
