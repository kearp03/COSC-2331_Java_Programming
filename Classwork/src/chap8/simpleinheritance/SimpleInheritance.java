package chap8.simpleinheritance;

public class SimpleInheritance {
	public static void main(String[] args) {
		A superObj = new A();
		B subObj = new B();
		
		//The superclass may be used by itself.
		superObj.i = 10;
		superObj.j = 20;
		System.out.println("Contents of superObj:");
		superObj.showiJ();
		System.out.println();
		
		//The subclass has access to all public member of its superclass
		subObj.i = 7;
		subObj.j = 8;
		subObj.k = 9;
		System.out.println("Contents of subObj:");
		subObj.showiJ();
		subObj.showk();
		System.out.println();
		
		System.out.println("Sum of i, j, and k in subObj:");
		subObj.sum();
	}
}