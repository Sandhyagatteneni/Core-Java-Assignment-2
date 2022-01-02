package com.polymorphism;

public abstract class Worker {
	int salary;
	abstract int Pay(int workHours);

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
