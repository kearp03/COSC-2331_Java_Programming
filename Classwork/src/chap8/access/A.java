package chap8.access;

public class A {
	int i;
	private int j; //private member
	
	void setij(int x, int y) {
		i = x;
		j = y;
	}
	
	public int getJ() {//public getter method
		return j;
	}
}

class B extends A {
	int total;
	
	void sum() {
		total = i + getJ();//B cannot access j directly, must use getter method
	}
}