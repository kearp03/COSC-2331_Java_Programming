package lab10.exe1;

public class Circle extends Figure {
	//circle radius
	private double radius;
	
	//no-param constructor
	public Circle() {
		super();
		radius = 0.0;
	}
	
	//one param constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//three param constructor
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	//generated getter and setter method
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//implements abstract getPerimeter() from Figure class
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	//method to return the diameter
	public double getDiameter() {
		return 2 * radius;
	}
	
	//implements abstract getArea() from Figure class
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//implements abstract toString() from Figure class
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + Math.round(getArea()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getDiameter()=" + Math.round(getDiameter()*Math.pow(10, 4)) / Math.pow(10, 4)
				+ ", getPerimeter()=" + Math.round(getPerimeter()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated() + "]";
	}
}