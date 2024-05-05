package lab10.exe1;

public abstract class Figure {
	//data members
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	//no-param constructor
	public Figure() {
		this("white", false);
	}
	
	//two param constructor
	public Figure(String color, boolean filled) {
		this.setColor(color);
		this.setFilled();
		this.dateCreated = new java.util.Date();
	}

	//generated getter and setter methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color.toLowerCase();
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled() {
		this.filled = !this.color.equals("white");
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	//abstract methods
	public abstract String toString();
	
	public abstract double getPerimeter();
	
	public abstract double getArea();
}