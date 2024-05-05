package lab4.exe1;

import java.util.Scanner;
import java.util.Random;

public class RandomPalindrome {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//reads number from user
		int n = intRead("Enter how many numbers you want checked");
		//builds array the same size as the user input
		int iNumberArray[] = new int[n];
		
		//loops as many times as the user input
		for(int i = 0; i < n; i++) {
			System.out.println(i+1);
			iNumberArray[i] = randomInt(); //generates random integer and stores in the array iNumberArray
			checkPalindrome(iNumberArray[i]); //checks if the number is a palindrome
		}
	}
	
	//static member function that returns a read int value
	static int intRead(String prompt) {
		System.out.print(prompt + ": ");
		return scan.nextInt();
	}
	
	//static member function that returns a randomly generated int from 0 to 999
	static int randomInt() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}
	
	//static member function to reverse a number and checks if it's a palindrome
	static void checkPalindrome(int iNumber) {
		int[] temp_reverse = {iNumber, 0};
		while(temp_reverse[0] != 0) {
			reverseNumber(temp_reverse);
		}
		System.out.println("Number: \t" + iNumber + "\nReversed: \t" + temp_reverse[1]);
		if(iNumber == temp_reverse[1]) System.out.println("Palindrome");
		else System.out.println("Not a Palinedrome");
		System.out.println();
	}
	
	//static member function that builds a reverse
	static void reverseNumber(int[] a) {
		a[1] = buildReverse(a[1], extractDigit(a[0]));
		a[0] /= 10;
	}
	
	//returns the rightmost digit of n
	static int extractDigit(int n) {
		return n % 10;
	}
	
	//static member function to mathematically build the reverse number
	static int buildReverse(int reverse, int n) {
		return reverse*10 + n;
	}
}