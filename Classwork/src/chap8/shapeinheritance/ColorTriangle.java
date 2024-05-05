package chap8.shapeinheritance;

//subclass of Triangle, adds color String field
public class ColorTriangle extends Triangle {//subclass of Triangle which is a subclass of TwoDimShape
	private String color;
	
	ColorTriangle(double width, double height, String style, String color) {
		//calls constructor in Triangle
		super(width, height, style);
		this.color = color;
	}

	public void showColor() {
		System.out.println("Color = " + color);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}