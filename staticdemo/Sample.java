package com.staticdemo;

public class Sample {
	static int obj;
	
	public void display() {
		obj++;
	}
	public static void main(String[] args) {
		Sample obj1 = new Sample();
		obj1.display();
		Sample obj2 = new Sample();
		obj2.display();
		Sample obj3 = new Sample();
		obj2.display();
		System.out.println("No of Objects = "+ Sample.obj);
	}
	
}