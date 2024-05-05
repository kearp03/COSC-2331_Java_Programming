package chap8.shapeinheritance;

//set style as private and include a constructor
//adds copy constructor with superclass constructor call
public class Triangle extends TwoDimShape {//subclass of TwoDimShape, no relation to Rectangle class
	private String style;
	
	Triangle(double width, double height, String style) {
		//calls constructor in TwoDimShape
		super(width, height, "Triangle");
		this.style = style;
	}
	
	Triangle(Triangle obj) {
		super(obj);
		this.style = obj.style;
	}
	
	void showStyle() {
		System.out.println("Style = " + this.getStyle());
	}
	
	double area() {
		return 0.5 * getWidth() * getHeight();
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
}