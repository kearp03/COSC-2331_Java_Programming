package lab8.tasks;
import java.util.Scanner;
import java.util.Random;

public class Tasks {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		task1();
		task2();
		takeHomeTask();
		task3();
		task4();
		task5();
		task6();
	}
	
	static void task1() {
		System.out.println("--------------------------\nTask 1");
		System.out.print("Enter a character: ");
		char ch = scan.next().charAt(0);
		
		System.out.println("Without methods:");
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is lowercase character");
		}
		else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is uppercase character");
		}
		else if(ch >= '0' && ch <= '9') {
			System.out.println(ch + " is numeric character");
		}
		else {
			System.out.println(ch + " is symbol character");
		}
		
		System.out.println("With methods:");
		if(Character.isLetter(ch)) {
			if(Character.isLowerCase(ch)) {
				System.out.println(ch + " is lowercase character");
			}
			else if(Character.isUpperCase(ch)) {
				System.out.println(ch + " is uppercase character");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch + " is numeric character");
		}
		else if(!Character.isLetterOrDigit(ch)){
			System.out.println(ch + " is symbol character");
		}
	}
	
	static void task2() {
		System.out.println("--------------------------\nTask 2");
		System.out.print("Enter a character: ");
		char ch = scan.next().charAt(0);
		
		if(Character.isLetter(ch)) {
			if(Character.isLowerCase(ch)) {
				System.out.println(ch + " is lowercase character");
				System.out.println("As uppercase: " + Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch)) {
				System.out.println(ch + " is uppercase character");
				System.out.println("As lowercase: " + Character.toLowerCase(ch));
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch + " is numeric character");
		}
		else if(!Character.isLetterOrDigit(ch)){
			System.out.println(ch + " is symbol character");
		}
	}
	
	/* write a program to find entered string length and an empty string length
	 * print character as per the entered valid index from the entered string
	 * concatenate entered string with a new string object using built-in method and then
	 * try with using + operator. print both the concatenated strings
	 * what happens if you use on the operand as string and another operand as a number
	 * while concatenating with + operator 
	 * apply trim method on the each concatenated string
	 */
	static void task3() {
		System.out.println("--------------------------\nTask 3");
		System.out.print("Enter a string: ");
		String s1 = scan.nextLine();
		
		System.out.println("String length: " + s1.length());
		System.out.println("Length of empty string: " + "".length());
		
		System.out.print("Enter an index of String: ");
		int index = scan.nextInt();
		if(index >= 0 && index < s1.length()) System.out.println("Character at " + index + ": " + s1.charAt(index));
		else System.out.println("Error: Invalid Index");
		
		String s2 = s1.concat(" New String");
		String s3  = s1 + " New String";
		
		System.out.println("Using method: " + s2);
		System.out.println("Using +: " + s3);
		
		String s4 = s1 + 1;
		System.out.println("+ with number: " + s4);
		
		System.out.println("\ntrim method:");
		System.out.println(s2.trim() + "\n" + s3.trim() + "\n" + s4.trim());
	}
	
	static void task4() {
		System.out.print("Enter two words separated by a space: ");
		String word1 = scan.next();
		String word2 = scan.next();
		
		System.out.println("Word 1: " + word1 + "\nWord 2: " + word2);
	}
	
	static void task5() {
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		System.out.println(s1 == s2); //a
		System.out.println(s2 == s3); //b
		System.out.println(s1.equals(s2)); //c
		System.out.println(s1.equals(s3)); //d
		System.out.println(s1.compareTo(s2)); //e
		System.out.println(s2.compareTo(s3)); //f
		System.out.println(s2.compareTo(s2)); //g
		System.out.println(s1.charAt(0)); //h
		System.out.println(s1.indexOf('j')); //i
		System.out.println(s1.indexOf("to")); //j
		System.out.println(s1.lastIndexOf('a')); //k
		System.out.println(s1.lastIndexOf("o", 15)); //l
		System.out.println(s1.length()); //m
		System.out.println(s1.substring(5)); //n
		System.out.println(s1.substring(5, 11)); //o
		System.out.println(s1.startsWith("Wel")); //p
		System.out.println(s1.endsWith("Java")); //q
		System.out.println(s1.toLowerCase()); //r
		System.out.println(s1.toUpperCase()); //s
		System.out.println(s1.concat(s2)); //t
		System.out.println(s1.contains(s2)); //u
		System.out.println("\t Wel \t".trim()); //v
	}

	static void task6() {
		String s1 = "Welcome";
		String s2 = "welcome";
		boolean isEqual = s1.equals(s2);
		System.out.println(isEqual);
		isEqual = s1.equalsIgnoreCase(s2);
		System.out.println(isEqual);
		int iX = s1.compareTo(s2);
		System.out.println(iX);
		iX = s1.compareToIgnoreCase(s2);
		System.out.println(iX);
		boolean b = s1.startsWith("AAA");
		System.out.println(b);
		b = s1.endsWith("AAA");
		System.out.println(b);
		iX = s1.length();
		System.out.println(iX);
		char cX = s1.charAt(0);
		System.out.println(cX);
		String s3 = s1 + s2;
		System.out.println(s3);
		String s1subString1 = s1.substring(1);
		System.out.println(s1subString1);
		String s1subString2 = s1.substring(1, 4);
		System.out.println(s1subString2);
		s3 = s1.toLowerCase();
		System.out.println(s3);
		s3 = s1.toUpperCase();
		System.out.println(s3);
		s3 = s1.trim();
		System.out.println(s3);
		iX = s1.indexOf('e');
		System.out.println(iX);
		iX = s1.lastIndexOf("abc");
		System.out.println(iX);
	}
	
	static void takeHomeTask() {
		System.out.println("--------------------------\nTake Home Task");
		System.out.print("Enter a character: ");

		System.out.println("ASCII code: " + (int)scan.next().charAt(0));
		
		System.out.print("Enter a decimal number: ");
		System.out.println("As character: " + (char)scan.nextInt());
		
		System.out.print("Enter a hexadecimal number: ");
		System.out.println("As character: " + (char)Integer.parseInt(scan.next(), 16));
		
		Random r = new Random();
		
		System.out.println("Random character: " + (char)r.nextInt(0x007F));
	}
}
