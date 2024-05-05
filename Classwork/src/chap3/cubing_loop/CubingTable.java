package chap3.cubing_loop;

public class CubingTable {
	public static void main(String[] args) {
	    System.out.println("base\tbase^2\tbase^3");
	    for(int base = 1; base <= 5; base++){
	        System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
	    }
	}
}
