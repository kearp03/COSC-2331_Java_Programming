package chap8.box;

//create an extension of Box called ColorBox with a String field color
//adds superclass constructor call
public class ColorBox extends Box{
	String color;
	
	ColorBox(double width, double height, double depth, String color) {
		//calls superclass constructor
		super(width, height, depth);
		this.color = color;
		System.out.println("Four param in ColorBox class");
	}
}