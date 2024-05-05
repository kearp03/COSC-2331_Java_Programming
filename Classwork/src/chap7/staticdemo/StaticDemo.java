package chap7.staticdemo;

public class StaticDemo {
	int x;
	static int y;
	
	int sum() {
		return this.x + y;
	}

	@Override
	public String toString() {
		return "StaticDemo [x=" + x + ", sum()=" + sum() + "]";
	}
}