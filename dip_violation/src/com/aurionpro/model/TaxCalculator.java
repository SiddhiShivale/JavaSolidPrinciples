package com.aurionpro.model;

public class TaxCalculator {

	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger, int amount, int rate) {
		super();
		this.dblogger = dblogger;
	}
	

	public TaxCalculator() {
		super();
	}
	

	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount/rate;
			System.out.println("Tax: " + tax);
			
		} catch(Exception exception) {
			new DBLogger().log("Divide by zero.");
		}
		
		return tax;
	}
}
