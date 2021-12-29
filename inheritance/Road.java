package com.inheritance;

public class Road extends Vehicle{

	public Road(int noOfWheels, String colour, String model) {
		super(noOfWheels, colour, model);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Truck t = new Truck(6, "xyz", "Green");
		Car c = new Car(4, "xyz", "Black");
		Bus b = new Bus(8, "xyz", "Blue");
		t.RegNum();
		t.Brake();
		t.Wheels();
		t.Transfer();
		System.out.println("Colour = "+t.colour+", Model = "+t.model+", No of Wheels = "+t.noOfWheels);
		System.out.println("-------------------------------------------------------------");
		c.RegNum();
		c.Brake();
		c.Wheels();
		c.Transfer();
		System.out.println("Colour = "+c.colour+", Model = "+c.model+", No of Wheels = "+c.noOfWheels);
		System.out.println("-------------------------------------------------------------");
		b.RegNum();
		b.Brake();
		b.Wheels();
		b.Transfer();
		System.out.println("Colour = "+b.colour+", Model = "+b.model+", No of Wheels = "+b.noOfWheels);
	}
}