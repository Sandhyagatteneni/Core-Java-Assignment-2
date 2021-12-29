package com.inheritance;

public class Bus extends Vehicle{
	
	
	public Bus(int noOfWheels, String colour, String model) {
		super(noOfWheels, colour, model);
		// TODO Auto-generated constructor stub
	}

	void Transfer() {
		System.out.println("Bus is used to transportation of people from one place to another");
	}
}
