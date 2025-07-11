package com.aurionpro.model;

public class DBLogger implements ILogger{

	@Override
	public void log(String error) {
		System.out.println("Logged to the database: " + error);
	}

}
