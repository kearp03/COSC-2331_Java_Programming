package chap9.interfaceinheritance;

public interface A {
	void method1();
	void method2();
}

interface B extends A {
	void method3();
}

class MyClass implements B {
	
	public void method1() {
		System.out.println("Method 1");
	}
	
	public void method2() {
		System.out.println("Method 2");
	}
	
	public void method3() {
		System.out.println("Method 3");
	}
}

class Test {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		m.method1();
		m.method2();
		m.method3();
	}
}