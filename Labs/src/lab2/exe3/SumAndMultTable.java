package lab2.exe3;
import java.util.Scanner;

/*
Call all the member functions in main( ). Define a menu with two choice options for the user to perform the following things:
1. Define a static member function that finds the sum of n natural numbers and its average.
2. Define a static member function to print the multiplication table up to n number for 1x1 till 1x10
*/

public class SumAndMultTable{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n;
		System.out.print("Enter a positive integer: ");
		n = scan.nextInt();
		
		System.out.println("Menu:");
		System.out.println("1) Sum of " + n + " natural numbers and its average");
		System.out.println("2) Multiplication table up to " + n + " for 1x1 till 1x10");
		int option = scan.nextInt();
		
		if(option == 1) natNumbers(n);
		else if(option == 2) multTable(n);
	}
	
	public static void natNumbers(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of natural numbers to " + n + ": " + sum);
		System.out.println("Average of natural numbers to " + n + ": " + sum/n);
	}
	
	public static void multTable(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(i + " x " + j + " = " + i*j + "  ");
			}
			System.out.println();
		}
	}
}