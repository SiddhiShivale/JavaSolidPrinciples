package com.aurionpro.model;

public class LocalDBLogger implements ILogger{

	@Override
	public void log(String error) {
		System.out.println("Logged to the local database: " + error);
	}

}
