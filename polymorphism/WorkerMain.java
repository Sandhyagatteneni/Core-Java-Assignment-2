package com.polymorphism;

public class WorkerMain {
		public static void main(String[] args) {
			DailyWorker d = new DailyWorker();
			SalariedWorker s = new SalariedWorker();
			d.Pay(35);
			s.Pay(40);
			System.out.println("Salary of DailyWorker = "+d.salary);
			System.out.println("Salary of SalariedWorker = "+s.salary);
		}
}