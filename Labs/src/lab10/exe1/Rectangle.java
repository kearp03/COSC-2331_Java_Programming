package lab10.exe1;

public class Rectangle extends Figure {
	//data members
	private double height, width;
	
	//no-param constructor
	public Rectangle() {
		super();
		height = width = 0.0;
	}
	
	//two param constructor
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	//four param constructor
	public Rectangle(double height, double width, String color, boolean filled) {
		super(color, filled);
		this.height = height;
		this.width = width;
	}

	//generated getter and setter methods
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//implements abstract getArea() from Figure class
	public double getArea() {
		return height * width;
	}
	
	//implements abstract getPerimeter() from Figure class
	public double getPerimeter() {
		return 2 * (height + width);
	}

	//implements abstract toString() from Figure class
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getArea()=" + Math.round(getArea()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getPerimeter()=" + Math.round(getPerimeter()*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated() + "]";
	}
}