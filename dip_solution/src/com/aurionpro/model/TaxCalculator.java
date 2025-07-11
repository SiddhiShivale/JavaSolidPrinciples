package com.aurionpro.model;

public class TaxCalculator {
	
	private ILogger logger;	

	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount/rate;
			System.out.println("Tax: " + tax);
			
		} catch(Exception exception) {
			String errorMessage = "Error Divide by zero.";
			new DBLogger().log(errorMessage);
			new FileLogger().log(errorMessage);
			new LocalDBLogger().log(errorMessage);
		}
		
		return tax;
	}
}
