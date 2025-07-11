package com.aurionpro.test;

import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		
		TaxCalculator t1 = new TaxCalculator();
		t1.calculateTax(1000, 10);
		
		TaxCalculator t2 = new TaxCalculator();
		t2.calculateTax(1000, 0);
	}
}
