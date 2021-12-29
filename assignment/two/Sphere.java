package com.assignment.two;

public class Sphere extends Shape3D{
	double h, r, surfacearea, volume;

	public void setH(double h) {
		this.h = h;
	}

	public void setR(double r) {
		this.r = r;
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
		volume = 4/3*3.14*(r*r*r);
		
	}

	@Override
	public void surfaceArea() {
		surfacearea = 4*3.14*(r*r);
		
	}
	
	
}
