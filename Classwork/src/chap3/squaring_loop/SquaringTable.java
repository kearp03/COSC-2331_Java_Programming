package chap3.squaring_loop;

public class SquaringTable {
	public static void main(String[] args) {
		System.out.println("base\tbase^2");
		for(int base = 1; base <= 5; base++){
		    System.out.println(base + "\t" + (int)Math.pow(base, 2));
		    //(int)Math.pow(base, 2) == base*base
			//(int) - Type casting from double to int
		}
	}
}