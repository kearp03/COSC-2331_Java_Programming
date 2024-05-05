package chap6.circledemo;

class Circle{
	double radius, area, perimeter;
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle circleOne = new Circle();
		Circle circleTwo = new Circle();
		Circle circleThree = new Circle();
		
		circleOne.radius = 5.5;
		circleOne.area = Math.PI * Math.pow(circleOne.radius, 2);
		circleOne.perimeter = 2 * circleOne.radius * Math.PI;
		
		System.out.println("Circle with radius " + circleOne.radius + ":");
		System.out.println("Area: " + circleOne.area);
		System.out.println("Perimeter: " + circleOne.perimeter);
		System.out.println();
		
		circleTwo.radius = 6.5;
		circleTwo.area = Math.PI * Math.pow(circleTwo.radius, 2);
		circleTwo.perimeter = 2 * circleTwo.radius * Math.PI;
		
		System.out.println("Circle with radius " + circleTwo.radius + ":");
		System.out.println("Area: " + circleTwo.area);
		System.out.println("Perimeter: " + circleTwo.perimeter);
		System.out.println();
		
		circleThree.radius = 10.2;
		circleThree.area = Math.PI * Math.pow(circleThree.radius, 2);
		circleThree.perimeter = 2 * circleThree.radius * Math.PI;
		
		System.out.println("Circle with radius " + circleThree.radius + ":");
		System.out.println("Area: " + circleThree.area);
		System.out.println("Perimeter: " + circleThree.perimeter);
	}
}