package com.aurionpro.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestival festival;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestival getFestival() {
		return festival;
	}
	public void setFestival(IFestival festival) {
		this.festival = festival;
	}
	
	public FixedDeposit(int accountNumber, String name, double principle, int duration, IFestival festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	public FixedDeposit() {
		super();
	}
	
	public double calculateSimpleInterest() {
		double rate = festival.getInterestRates();
		return (principle * duration * rate) / 100;
	}
}
