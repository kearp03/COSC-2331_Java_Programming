package chap8.supsubreference;

public class TestSuperSub {
	public static void main(String[] args) {
		Super x = new Super(10);
		Super x2;
		Sub y = new Sub(5, 6);
		
		x2 = x; //OK, both of the same type
		System.out.println("x2.a = " + x2.a);
		
		x2 = y; //still OK because Sub is derived from Super
		System.out.println("x2.a = " + x2.a);
		
		//Super references know only about Super members
		x2.a = 19;
		//x2.b = 27; Error, x2 doesn't have reference to b in Sub class
	}
}