package generics;

class TestGen <T> {
	T start;
	T val;
	
	TestGen(T a, T b) {
		start = a;
		val = b;
	}
	
	void print() {
		System.out.println("start = " + start + ", val = " + val);
	}
}

public class GenericsTest {
	public static void main(String[] args) {
		TestGen <Integer> obj1 = new TestGen<>(10,20);
		TestGen <Double> obj2 = new TestGen<>(10.0, 20.0);
		TestGen <String> obj3 = new TestGen<>("Hi", "Java");
		
		obj1.print();
		obj2.print();
		obj3.print();
	}
}
