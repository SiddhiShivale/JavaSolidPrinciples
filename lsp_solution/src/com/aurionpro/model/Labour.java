package com.aurionpro.model;

public class Labour implements IHuman{

	@Override
	public void startWork() {
		System.out.println("Human started the work.");
	}

	@Override
	public void stopWork() {
		System.out.println("Human stopped the work.");
	}

	@Override
	public void eat() {
		System.out.println("Human eats.");
	}

	@Override
	public void drink() {
		System.out.println("Human drinks.");
	}

}
