package chap3.cubing;

public class CubingTable {
	public static void main(String[] args) {
		int base = 1;
		System.out.println("base\tbase^2\tbase^3");
		System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
		base++;
		System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
		base++;
		System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
		base++;
		System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
		base++;
		System.out.println(base + "\t" + (int)Math.pow(base, 2) + "\t" + (int)Math.pow(base, 3));
	}
}
