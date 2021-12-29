package com.polymorphism;

public class Worker {
	int salary;
	int Pay(int hours) {
		salary = hours*100;
		return salary;
	}
}

class DailyWorker extends Worker {

	@Override
	int Pay(int hours) {
		super.Pay(hours);
		salary = hours*100;
		return salary;
	}
}

class SalariedWorker extends Worker {

	
}


/*Create a class called Worker. 
 * Write classes DailyWorker and SalariedWorker 
 * that inherit from Worker.
 * Every worker has a name and a salaryrate. 
 * Write method Pay (int hours) to compute the week pay of every worker. 
 * A Daily worker is paid on the basis of the number of days she/he works.
 * The salaried worker gets paid the wage for 40 hours a week no matter 
 * what the actual hours are. 
 * Test this program to calculate the pay of workers.
 */
