package com.inheritance.copy;

public class Bus extends Vehicle{
	public Bus() {
		
	}
	private Bus(String colour, String model, int noOfWheels) {
		super(colour, model, noOfWheels);
		// TODO Auto-generated constructor stub
	}

	private void Transfer() {
		System.out.println("Bus is used to transportation of people from one place to another");
	}
}
