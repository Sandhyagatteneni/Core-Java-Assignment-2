package com.assignment.two;

public class Cube extends Shape3D{
	double a, surfacearea, volume;
	
	public void setA(double a) {
		this.a = a;
	}

	public double getSurfacearea() {
		surfaceArea();
		return surfacearea;
	}

	public double getVolume() {
		volume();
		return volume;
	}

	@Override
	public void volume() {
		volume = a*a*a;		
	}

	@Override
	public void surfaceArea() {
		surfacearea = a*a;
		
	}
	
}
