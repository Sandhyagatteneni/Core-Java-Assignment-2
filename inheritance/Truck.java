package com.inheritance;

public class Truck extends Vehicle{
	
	public Truck(int noOfWheels, String colour, String model) {
		super(noOfWheels, colour, model);
		// TODO Auto-generated constructor stub
	}

	void Transfer() {
		System.out.println("Truck is used to transfer goods from one place to another");
	}
}
