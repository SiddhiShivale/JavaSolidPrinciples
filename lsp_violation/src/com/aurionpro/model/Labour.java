package com.aurionpro.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		System.out.println("A labour started the work.");
	}

	@Override
	public void stopWork() {
		System.out.println("A labour stopped the work.");
	}

	@Override
	public void eat() {
		System.out.println("A labour eats.");
	}

	@Override
	public void drink() {
		System.out.println("A labour drinks.");
	}

}
