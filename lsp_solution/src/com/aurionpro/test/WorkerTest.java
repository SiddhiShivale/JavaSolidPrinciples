package com.aurionpro.test;

import com.aurionpro.model.IHuman;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Labour;
import com.aurionpro.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		
		IHuman labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		
	}
}
