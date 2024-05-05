package chap8.shapeinheritance;

public class Rectangle extends TwoDimShape {//subclass of TwoDimShape, no relation to Triangle class
	Rectangle(double length) {
		super(length, length, "Rectangle");
	}
	
	Rectangle(double width, double height) {
		super(width, height, "Rectangle");
	}
	
	Rectangle(Rectangle obj) {
		super(obj);
	}
	
	boolean isSquare() {
		return getWidth() == getHeight();
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}