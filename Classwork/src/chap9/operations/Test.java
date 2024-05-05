package chap9.operations;

interface Operations {
	void initArray();
	void printArray();
	
	default void arraySum() {
		System.out.println("NOT APPLICABLE TO THIS OBJECT");
	}
	
	default void arrayProduct() {
		System.out.println("NOT APPLICABLE TO THIS OBJECT");
	}
}

class ArraySum implements Operations {
	int[] arr;
	
	ArraySum(int n) {
		arr = new int[n];
	}
	
	public void initArray() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
	}
	
	public void printArray() {
		for(int z : arr) {
			System.out.print(z + " ");
		}
		System.out.println();
	}
	
	public void arraySum() {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}
}

public class Test {
	public static void main(String[] args) {
		ArraySum s = new ArraySum(10);
		s.initArray();
		s.printArray();
		s.arraySum();
		s.arrayProduct();
	}
}