package com.xml.config;

public class CricketCoaching implements Coach {

	private Fortune fortune;
	private String email;
	private String sports;

	
	@Override
	public String getDailyWorkout() {
		return "I play cricket" + getEmail() +" " +getSports();
	}

	@Override
	public String getFortune() {
		return fortune.getMyFortune();
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}
	
	

}
