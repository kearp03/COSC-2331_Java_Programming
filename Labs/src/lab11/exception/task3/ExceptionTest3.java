package lab11.exception.task3;
import java.util.Scanner;

public class ExceptionTest3 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Numerator: ");
		int n = scan.nextInt();
		System.out.print("Denominator: ");
		int d = scan.nextInt();

		double result = 0.0;
		try {
			 result = checkDen(n, d);
			
		}
		catch(ArithmeticException exe) {
			System.out.println("Divide by zero error");
		}
		
		System.out.println("Result = " + result);
	}
	
	static double checkDen(int n, int d) {
		if(d == 0) throw new ArithmeticException();
		
		return (double) n / d;
	}
}