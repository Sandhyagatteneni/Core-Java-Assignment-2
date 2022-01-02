package com.polymorphism;

public class DailyWorker extends Worker {

	@Override
	int Pay(int workHours) {
		int salary = workHours * 100;
		return salary;
	}
	
}
