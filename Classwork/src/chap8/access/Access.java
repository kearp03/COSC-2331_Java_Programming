package chap8.access;

public class Access {
	public static void main(String[] args) {
		B subObj = new B();
		
		subObj.setij(10, 12);
		
		subObj.sum();
		System.out.println("Total is " + subObj.total);
	}
}