package com.inheritance.copy;

public class Truck extends Vehicle{
	
	private Truck(String colour, String model, int noOfWheels) {
		super(colour, model, noOfWheels);
		// TODO Auto-generated constructor stub
	}
	public Truck() {
		
	}
	private void Transfer() {
		System.out.println("Truck is used to transfer goods from one place to another");
	}
}
