package com.mvalho.study.pattern.prototype.model;

public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method.");
	}

}
