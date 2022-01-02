package com.inheritance.copy;

public class Car extends Vehicle{
	
	private Car(String colour, String model, int noOfWheels) {
		super(colour, model, noOfWheels);
		// TODO Auto-generated constructor stub
	}
	public Car() {
		
	}

	private void Transfer() {
		System.out.println("Car is used to travel from one place to another");
	}
}
