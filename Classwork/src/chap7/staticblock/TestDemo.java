package chap7.staticblock;

public class TestDemo {
	static {
		System.out.println("Static block in TestDemo");
	}
	
	public static void main(String[] args) {
		System.out.println("Before object creation");
		
		//Demo obj = new Demo();
		
		System.out.println(Demo.var1 + ", " + Demo.var2);
	}
}
