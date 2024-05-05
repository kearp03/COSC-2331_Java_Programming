package lab1.exe3;

public class MathExample {
	public static void main(String[] args) {
		//Question 3:
		System.out.println("Question 3:");
		System.out.println(Math.pow(2,2) + (3*4)/(3.0+4.0));
		//Follows precedence and order of operation rules: PEMDAS and calls math function pow
		System.out.println((Math.pow(2,2) + (3*4))/(3.0+4.0));
		//Extra parentheses forces addition before division
		//print statement will evaluate mathematical expression before printing

	}
}