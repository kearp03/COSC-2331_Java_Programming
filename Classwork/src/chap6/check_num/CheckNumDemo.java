package chap6.check_num;
import java.util.Scanner;

class CheckNum {
	static boolean isEven(int num) {
		return num % 2 == 0;
	}
}

public class CheckNumDemo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		if(CheckNum.isEven(num)) System.out.println(num + " is even");
		else System.out.println(num + " is odd");
	}
}