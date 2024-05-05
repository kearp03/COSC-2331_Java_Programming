package chap4and5.sum_with_condition;
import java.util.Scanner;

public class SumLoopWithCondition {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num, sum = 0;
		for(int i = 0; i < 5; i++){
		    System.out.print("Enter a positive integer: ");
		    num = scan.nextInt();
		    if(num < 0) continue;
		    sum += num;
		    System.out.println("Sum = " + sum);
		}
	}
}
