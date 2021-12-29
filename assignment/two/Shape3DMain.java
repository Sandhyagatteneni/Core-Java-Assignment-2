package com.assignment.two;

public class Shape3DMain {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setR(5);
		c.setH(6.2);
		System.out.println("Surface area of Cylinder = "+c.getSurface_area());
		System.out.println("Volume of Cylinder = "+c.getVolume());
		System.out.println("--------------------------------------------------------");
		Sphere s = new Sphere();
		c.setR(7.6);
		c.setH(5.3);
		System.out.println("Surface area of Sphere = "+s.getSurfacearea());
		System.out.println("Volume of Cylinder = "+c.getVolume());
		System.out.println("--------------------------------------------------------");
		Cube cu = new Cube();
		cu.setA(6.7);
		System.out.println("Surface area of Cube = "+cu.getSurfacearea());
		System.out.println("Volume of Cube = "+cu.getVolume());
	}
}
