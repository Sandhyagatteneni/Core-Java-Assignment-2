package com.polymorphism;

public class SalariedWorker extends Worker {
	int hours = 40;
	@Override
	int Pay(int workHours) {
		int salary = hours*100;
		return salary;
	}

}
