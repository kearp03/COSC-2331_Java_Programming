package chap6.factor;
import java.util.Scanner;

class Factor {
	static boolean isFactor(int n1, int n2) {
		if(n2 % n1 == 0) return true;
		return false;
	}
}

public class FactorDemo {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter a possible factor: ");
		int num2 = scan.nextInt();
		
		if(Factor.isFactor(num2, num2)) System.out.println(num2 + " is a factor of " + num1);
		else System.out.println(num2 + " is not a factor of " + num1);
	}
}