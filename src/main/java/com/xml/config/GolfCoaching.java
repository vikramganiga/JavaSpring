package com.xml.config;

public class GolfCoaching implements Coach {
	
	private Fortune fortune;
	
	public GolfCoaching(Fortune fortune) {
		this.fortune =fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "I am play Goalf";
	}

	@Override
	public String getFortune() {
		return fortune.getMyFortune();
	}

}
