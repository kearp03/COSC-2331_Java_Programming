package chap7.array_revisited;

/* Declare three arrays in main()
 *  one array with size 10 using new operator
 *  second array by initializing some int values
 *  third array by initializing some float values
 *  print size of each array
 * */

/* Declare an array of size 10 in main()
 * initialize it with some values
 * find min and max element in that array
 * */

/* Create two arrays of size 10
 *  Initialize some values to both (different values)
 *  print them
 *  make first array reference to second array
 *  then print the arrays again
 * */

public class ArrayLengthDemo {
	public static void main(String[] args) {
		int a1[] = new int[10];
		int a2[] = {10, 20, 30, 40};
		float a3[] = {1.1f, 2.2f, 3.3f};
		//1.1 -> interpreted as double
		//1.1f -> interpreted as float
		
		for(int i = 0; i < a1.length; i++) a1[i] = i*2;
		
		System.out.println("Array a1:");
		System.out.println("Length: " + a1.length + ":");
		for(int x : a1) {
			System.out.print(x + "  ");
		}
		System.out.println();
		minMax(a1); //invokes int version
		
		
		System.out.println("\nArray a2:");
		System.out.println("Length: " + a2.length + ":");
		for(int x : a2) {
			System.out.print(x + "  ");
		}
		System.out.println();
		minMax(a2); //invokes int version
		
		System.out.println("\nArray a3:");
		System.out.println("Length: " + a3.length + ":");
		for(float x : a3) {
			System.out.print(x + "  ");
		}
		System.out.println();
		minMax(a3); //invokes float version
		
		
		System.out.println("\n\n");
		
		
		int[] b1 = new int[10];
		int[] b2 = new int[10];
		
		for(int i = 0; i < b1.length; i++) b1[i] = i*2;
		for(int i = 0; i < b2.length; i++) b2[i] = i*4;
		
		System.out.println("Array b1:");
		System.out.println("Length: " + b1.length + ":");
		for(int x : b1) {
			System.out.print(x + "  ");
		}
		
		System.out.println("\nArray b2:");
		System.out.println("Length: " + b2.length + ":");
		for(int x : b2) {
			System.out.print(x + "  ");
		}
		
		//makes b2 point to b1's memory address
		//changes to b2 reflect in b1 and vice versa
		b2 = b1;
		System.out.println("\n\nAfter b2 = b1\n");
		
		System.out.println("Array b1:");
		System.out.println("Length: " + b1.length + ":");
		for(int x : b1) {
			System.out.print(x + "  ");
		}
		
		System.out.println("\nArray b2:");
		System.out.println("Length: " + b2.length + ":");
		for(int x : b2) {
			System.out.print(x + "  ");
		}
	}
	
	static void minMax(int a[]) {
		int max, min;
		max = min = a[0];

		for(int x : a) {
			if(x < min) min = x;
			if(x > max) max = x;
		}
		
		System.out.println("Min = " + min + " Max = " + max);
	}
	
	static void minMax(float a[]) {
		float max, min;
		max = min = a[0];
		
		for(float x : a) {
			if(x < min) min = x;
			if(x > max) max = x;
		}
		
		//printf works the same in Java as it did in C
		System.out.printf("Min = %.2f Max = %.4f", min, max);
	}
}