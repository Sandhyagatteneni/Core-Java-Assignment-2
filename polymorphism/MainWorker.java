package com.polymorphism;

import java.util.Scanner;

public class MainWorker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DailyWorker dailyWorker = new DailyWorker();
		SalariedWorker salariedWorker = new SalariedWorker();
		System.out.println("Enter Employement Type :\n1.Daily Worker\n2.Salaried Worker");
		int n = sc.nextInt();
		
		if(n<=2) {
		System.out.println("Enter number of hours worked : ");
		int workHours = sc.nextInt();
		
		switch(n) {
		case 1: 
			System.out.println("The salary of the employee : "+dailyWorker.Pay(workHours));
			break;
		case 2:
			System.out.println("The salary of the employee : "+salariedWorker.Pay(workHours));
			break;
			}
		}	
		else
			System.out.println("You must enter the number 1 or 2");
	}
	
}
