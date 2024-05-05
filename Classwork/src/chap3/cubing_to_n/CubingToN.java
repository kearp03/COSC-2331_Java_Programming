package chap3.cubing_to_n;
import java.util.Scanner;

public class CubingToN {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.print("Enter a max base integer for squares and cubes: ");
		int max = scan.nextInt();
		
		System.out.println("base\tbase^2");
		for(int base = 1; base <= max; base++){
		    System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
		}
	}
}