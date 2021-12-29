package com.inheritance;

public class Car extends Vehicle{
	
	public Car(int noOfWheels, String colour, String model) {
		super(noOfWheels, colour, model);
		// TODO Auto-generated constructor stub
	}

	void Transfer() {
		System.out.println("Car is used to travel from one place to another");
	}
}
