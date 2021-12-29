package com.assignment.two;

public class Cylinder extends Shape3D{
	private double r, h, volume, surface_area;

	public void setR(double r) {
		this.r = r;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	public double getVolume() {
		volume();
		return volume;
	}

	public double getSurface_area() {
		surfaceArea();
		return surface_area;
	}

	@Override
	public void volume() {
		volume = 3.14*r*r*h;
	}

	@Override
	public void surfaceArea() {
		surface_area = 2*3.14*r*(r+h);
	}
	

}
