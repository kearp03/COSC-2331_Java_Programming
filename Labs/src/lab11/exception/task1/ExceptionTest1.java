package lab11.exception.task1;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 10;
		a[1] = 20;
		
		
		System.out.println("Before");
		try {
			a[7] = 10;
		}
		catch(ArrayIndexOutOfBoundsException exe) {
			System.out.println("Accessing an index which is not valid....");
		}
		System.out.println("After");
		
		try {
			a[0] = a[1] / 0;
		}
		catch(ArithmeticException exe) {
			a[0] = 0/a[1];
			System.out.println("Divide by zero error. So, numerator and denomenator swapped " + exe);
		}
	}
}