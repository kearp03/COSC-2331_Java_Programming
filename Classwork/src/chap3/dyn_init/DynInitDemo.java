package chap3.dyn_init;
import java.util.Scanner;

public class DynInitDemo{
	private static Scanner scan;

	public static void main(String[] args) {
	    scan = new Scanner(System.in);
	    double a, b, c;
	    
	    System.out.print("a: ");
	    a = scan.nextDouble(); //initialized dynamically
	    System.out.print("b: ");
	    b = scan.nextDouble(); //initialized dynamically
	    
	    c = Math.sqrt(a*a + b*b); //initialized dynamically
	    System.out.println("c: " + c);
	}
}
