package com.aurionpro.test;

import com.aurionpro.model.Diwali;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.Holi;
import com.aurionpro.model.NewYear;
import com.aurionpro.model.Others;

public class FDTest {

	public static void main(String[] args) {
		
		FixedDeposit fd1 = new FixedDeposit(1, "Siddhi", 10000, 2, new NewYear());
		System.out.println("Simple interest for new year: " + fd1.calculateSimpleInterest());
		
		FixedDeposit fd2 = new FixedDeposit(1, "Siddhi", 10000, 2, new Diwali());
		System.out.println("Simple interest for diwali: " + fd2.calculateSimpleInterest());
		
		FixedDeposit fd3 = new FixedDeposit(1, "Siddhi", 10000, 2, new Holi());
		System.out.println("Simple interest for holi: " + fd3.calculateSimpleInterest());
		
		FixedDeposit fd4 = new FixedDeposit(1, "Siddhi", 10000, 2, new Others());
		System.out.println("Simple interest for others: " + fd4.calculateSimpleInterest());
	}
}
