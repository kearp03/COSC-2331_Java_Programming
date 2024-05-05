package chap8.shapeinheritance;

/*
public static void main(String[] args) {
	TwoDimShape twoD = new TwoDimShape(7, 4);
	Triangle t1 = new Triangle(5, 3, "filled"), 
			 t2 = new Triangle(3, 7, "outlined");
	ColorTriangle ct3 = new ColorTriangle(4, 8, "filled", "blue");
	Rectangle r1 = new Rectangle(5, 10), r2 = new Rectangle(7);
	
	//no need to initialize twoD here
	System.out.println("twoD:");
	twoD.showDim();
	System.out.println();
	
	//no need to initialize t1 here
	System.out.println("t1:");
	t1.showDim();
	t1.showStyle();
	System.out.println("Area = " + t1.area());
	System.out.println();
	
	//no need to initialize t2 here
	System.out.println("t2:");
	t2.showDim();
	t2.showStyle();
	System.out.println("Area = " + t2.area());
	System.out.println();
	
	System.out.println("ct3:");
	ct3.showDim();
	ct3.showStyle();
	ct3.showColor();
	System.out.println("Area = " + ct3.area());
	System.out.println();
	
	//no need to initialize r1 here
	System.out.println("r1:");
	r1.showDim();
	System.out.println(r1.isSquare() ? "Is a square" : "Is not a square");
	System.out.println("Area = " + r1.area());
	System.out.println();
	
	//no need to initialize r2 here
	System.out.println("r2:");
	r2.showDim();
	System.out.println(r2.isSquare() ? "Is a square" : "Is not a square");
	System.out.println("Area = " + r2.area());
}
*/

public class Test {
	public static void main(String[] args) {
		TwoDimShape[] shapes = new TwoDimShape[4];
		
		shapes[0] = new Triangle(4, 2.2, "Right");
		shapes[1] = new Triangle(9, 8.8, "dotted line");
		shapes[2] = new Rectangle(1.5, 3.5);
		shapes[3] = new Rectangle(6.6);
		//shapes[4] = new TwoDimShape(0.0, 0.0, "Generic");
		
		for(TwoDimShape obj : shapes) {
			System.out.println("Shape name: " + obj.getName());
			System.out.println("Area: " + obj.area());
			System.out.println();
		}
	}
}