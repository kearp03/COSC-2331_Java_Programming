package chap8.shapeinheritance;
//make fields of TwoDimShape private and add getter/setter methods

/* create a zero, one, and two parameterized constructor and invoke 
 * it through the inherited classes overloaded constructor
 */
public abstract class TwoDimShape {//superclass
	private double width, height;
	private String name;
	
	public TwoDimShape() {}

	public TwoDimShape(double width) {
		this.width = width;
	}

	public TwoDimShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	TwoDimShape(TwoDimShape obj) {
		this(obj.width, obj.height, obj.name);
	}

	public void showDim() {
		System.out.println("width = " + width + " height = " + height);
	}
	
	abstract double area(); //enforces strict rule

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}