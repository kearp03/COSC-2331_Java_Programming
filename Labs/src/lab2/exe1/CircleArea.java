package lab2.exe1;
import java.util.Scanner;

public class CircleArea {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double radius, area;
		System.out.print("Enter the radius: ");
		radius = scan.nextDouble();
		area = 3.14 * Math.pow(radius, 2);
		
		System.out.println("Area of a circle with " + radius + " radius is: " + area);
	}
}
