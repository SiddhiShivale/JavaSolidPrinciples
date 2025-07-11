package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(1, "Siddhi", 10000, 2, FestivalType.DIWALI);
		System.out.println("Simple interest for Diwali: " + fd1.calculateSimpleInterest());
		
		FixedDeposit fd2 = new FixedDeposit(1, "Siddhi", 10000, 2, FestivalType.NEWYEAR);
		System.out.println("Simple interest for New Year: " + fd2.calculateSimpleInterest());
		
		FixedDeposit fd3 = new FixedDeposit(1, "Siddhi", 10000, 2, FestivalType.HOLI);
		System.out.println("Simple interest for holi: " + fd3.calculateSimpleInterest());
		
		FixedDeposit fd4 = new FixedDeposit(1, "Siddhi", 10000, 2, FestivalType.OTHERS);
		System.out.println("Simple interest for Others: " + fd4.calculateSimpleInterest());
	}

}
