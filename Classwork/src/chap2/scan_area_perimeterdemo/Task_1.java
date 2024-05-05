package chap2.scan_area_perimeterdemo;
import java.util.Scanner;

public class Task_1{
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in); 
		double width, height, area, perimeter;
		
		System.out.print("Enter the width: ");
		width = scan.nextDouble();
		System.out.print("Enter the height: ");
		height = scan.nextDouble();
		
		area = width * height;
		perimeter = 2 * (width + height);
		
		System.out.println("Area of rectangle with " + width + " width and " + height + " height is: " + area);
		System.out.println("Perimeter of rectangle with " + width + " width and " + height + " height is: " + perimeter);
	}
}
