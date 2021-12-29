package com.inheritance;

public class Vehicle {
	
	int noOfWheels;
	String colour, model;
	
	public Vehicle(int noOfWheels, String colour, String model) {
		super();
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.model = model;
	}
	
	void RegNum() {
		System.out.println("Vehicle has a Registration Number");
	}
	void Brake() {
		System.out.println("Vehicle has a brake");
	}
	void Wheels() {
		System.out.println("Vehicle has wheels");
	}
}
/*Exercise 2:Create a class called Vehicle. 
 * Create subclasses like Truck, Bus, Car etc. 
 * Add common methods in the base class and specific methods in the corresponding class. 
 * Create a class called Road and 
 * create objects for the Truck, Car, Bus etc and 
 * display the appropriate message.
 * Exercise 3:In the Lab Exercise above, 
 * in the Vehicle class constructor initialize few variables like 
 * color, no of wheels, model etc. 
 * Give appropriate values for these variables from the invoking subclass.
 * Exercise 4:In the Lab Exercise above, 
 * create another class called City which 
 * creates an object for the Car, Truck and Bus class and 
 * displays the details through a display () method in the Vehicle class.
 * The other methods and data members should not be accessible by the City class.
 */

