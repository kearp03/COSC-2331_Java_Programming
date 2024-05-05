package chap6.constructordemo;

class MyClass {
	int x;
	
	MyClass() {//zero argument constructor
		x = 10;
	}
	
	MyClass(int i) {//parameterized constructor
		x = i;
	}
}

public class ConstDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass(80);
		
		System.out.println(t1.x + " " + t2.x);
	}
}