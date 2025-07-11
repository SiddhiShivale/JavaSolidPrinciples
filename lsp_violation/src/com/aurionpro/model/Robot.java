package com.aurionpro.model;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("A robot started the work.");
	}

	@Override
	public void stopWork() {
		System.out.println("A robot stopped the work.");
	}

	@Override
	public void eat() {
		System.out.println("A robot does not eat.");
	}

	@Override
	public void drink() {
		System.out.println("A robot does not drink.");
	}

}
