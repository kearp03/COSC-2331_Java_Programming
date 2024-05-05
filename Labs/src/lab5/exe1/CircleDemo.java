package lab5.exe1;
import java.util.Scanner;

class Circle {
	private double dRadius, dArea, dCircum, dDiameter;
	private final double dPI = Math.PI;
	private Scanner scan;
	
	Circle() {
		this(0);
	}
	
	Circle(double r) {
		dRadius = r;
		calArea();
		calCircum();
		this.dDiameter = 2 * this.dRadius;
	}
	
	Circle(double r, double a) {
		dRadius = r;
		dArea = a;
		calCircum();
		this.dDiameter = 2 * this.dRadius;
	}
	
	void initAll(double dRadius) {
		this.dRadius = dRadius;
		calArea();
		calCircum();
		this.dDiameter = 2 * this.dRadius;
	}
	
	public void readSome() {
		scan = new Scanner(System.in);
		System.out.print("Enter radius: ");
		dRadius = scan.nextDouble();
		calArea();
		calCircum();
		this.dDiameter = 2 * this.dRadius;
	}
	
	public void printAll() {
		System.out.println("Radius: " + dRadius);
		System.out.println("Diameter: " + dDiameter);
		System.out.println("PI: " + dPI);
		System.out.println("Area: " + dArea);
		System.out.println("Circumference: " + dCircum);
		System.out.println("Perimeter: " + calPerimeter());
	}
	
	public void printSome(double value) {
		System.out.println(value);
	}
	
	public void calArea() {
		dArea = dPI * Math.pow(dRadius, 2);
	}
	
	public void calCircum() {
		dCircum = 2 * dPI * this.dRadius;
	}
	
	public double calPerimeter() {
		return 2 * dPI * this.dRadius;
	}
	
	public void setdRadius(double dRadius) {
		this.dRadius = dRadius;
	}

	public void setdArea(double dArea) {
		this.dArea = dArea;
	}

	public void setdCircum(double dCircum) {
		this.dCircum = dCircum;
	}

	public void setdDiameter(double dDiameter) {
		this.dDiameter = dDiameter;
	}

	public double getdRadius() {
		return dRadius;
	}

	public double getdArea() {
		return dArea;
	}

	public double getdCircum() {
		return dCircum;
	}

	public double getdDiameter() {
		return dDiameter;
	}
	
	public double getdPI() {
		return dPI;
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.initAll(3.2);
		System.out.println("c1:");
		c1.printAll();
		System.out.println();
		
		Circle c2 = new Circle();
		c2.readSome();
		System.out.println("c2:");
		c2.printAll();
		System.out.print("Printing Some\nArea: ");
		c2.printSome(c2.getdArea());
		
		Circle c3 = new Circle();
		System.out.println("\nc3:");
		c3.printAll();
		
		Circle c4 = new Circle(6.2);
		System.out.println("\nc4:");
		c4.printAll();
		
		Circle c5 = new Circle(2, 6.28);
		System.out.println("\nc5:");
		c5.printAll();
	}
}