package chap7.staticdemo;

public class Test {

	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		s1.x = 10;
		s2.x = 15;
		
		StaticDemo.y = 5;
		
		System.out.println("StaticDemo.y: " + StaticDemo.y);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}