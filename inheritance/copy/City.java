package com.inheritance.copy;

public class City extends Vehicle{
	public static void main(String[] args) {
		Bus b = new Bus();
		Car c = new Car();
		Truck t = new Truck();
		b.Display();
		c.Display();
		t.Display();
	}
}
