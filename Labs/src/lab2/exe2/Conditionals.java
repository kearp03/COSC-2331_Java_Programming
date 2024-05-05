package lab2.exe2;
import java.util.Scanner;

/*
 * Read three numbers and find the biggest of three using the following:
You can ask the user to select the choice of finding it with the following four options.
if only
nested if
if else only
else if ladder 
*/

public class Conditionals{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter 3 integers: ");
		System.out.print("Number 1: ");
		num1 = scan.nextInt();
		System.out.print("Number 2: ");
		num2 = scan.nextInt();
		System.out.print("Number 3: ");
		num3 = scan.nextInt();
		
		System.out.println("How would you like to find the largest value:");
		System.out.println("(1) if only\n(2) nested if\n(3) if else only\n(4) else if ladder\n(5) QUIT");
		int option = scan.nextInt();
		
		if(option == 1 || option == 2) {
			if(num1 >= num2 && num1 >= num3) System.out.println(num1 + " is the largest");
			if(num2 >= num1 && num2 >= num3) System.out.println(num2 + " is the largest");
			if(num3 >= num1 && num3 >= num2) System.out.println(num3 + " is the largest");
		}
		else if(option == 3) {
			if(num1 >= num2) {
				if(num1 >= num3) System.out.println(num1 + " is the largest");
				else System.out.println(num3 + " is the largest");
			}
			else {
				if(num2 >= num3) System.out.println(num2 + " is the largest");
				else System.out.println(num3 + " is the largest");
			}
		}
		else if(option == 4) {
			if(num1 >= num2 && num1 >= num3) System.out.println(num1 + " is the largest");
			else if(num2 >= num3) System.out.println(num2 + " is the largest");
			else System.out.println(num3 + " is the largest");
		}
		else if(option == 5) {
			System.out.println("Process has been quit");
		}
		else {
			System.out.println("Option not reconized");
		}
	}
}