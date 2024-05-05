package lab11.exception.task6;

public class MultipleExcep {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6},
			  b = {1, 0, 2, 0, 2};
		for(int i = 0; i < a.length; i++) {
			try {
				System.out.println("a[" + i +"]/b["+ i + "] = " + a[i]/b[i]);
			}
			catch(ArithmeticException ex) {
				System.out.println("Divide by zero error");
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("accessing invalid index");
			}
		}
	}
}