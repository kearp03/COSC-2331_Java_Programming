package chap8.simpleinheritance;

public class A {
	int i, j;
	
	void showiJ() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	
	void showk() {
		System.out.println("k: " + k);
	}
	
	void sum() {
		System.out.println("i+j+k: " + (i+j+k));
	}
}