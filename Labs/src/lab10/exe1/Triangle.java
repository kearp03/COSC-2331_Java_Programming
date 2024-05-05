package lab10.exe1;

public class Triangle extends Figure {
	//triangle side lengths
	private double sideOne, sideTwo, sideThree;
	
	//no-param constructor
	public Triangle() {
		super();
		sideOne = sideTwo = sideThree = 0.0;
	}
	
	//three param constructor
	public Triangle(double sideOne, double sideTwo, double sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	//five param constructor
	public Triangle(double sideOne, double sideTwo, double sideThree, String color, boolean filled) {
		super(color, filled);
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	//generated getter and setter methods
	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}
	
	//implements abstract getArea() from Figure class
	public double getArea() {
		double p = (sideOne + sideTwo + sideThree) / 2;
		return Math.sqrt(Math.abs(p * (p - sideOne) * (p - sideTwo) * (p - sideThree)));
	}
	
	//implements abstract getPerimeter() from Figure class
	public double getPerimeter() {
		return sideOne + sideTwo + sideThree;
	}

	//implements abstract toString() from Figure class
	@Override
	public String toString() {
		return "Triangle [sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", sideThree=" + sideThree + ", getArea()="
				+ Math.round(getArea()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getPerimeter()=" + Math.round(getPerimeter()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated() + "]";
	}
}