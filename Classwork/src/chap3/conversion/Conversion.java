package chap3.conversion;

public class Conversion{
	public static void main(String[] args){
		byte bA;
		int iA = 257;
		double dA = 323.142;
		System.out.println("int to byte");
		bA = (byte) iA; //257 % 256 = 1
		System.out.println("iA and bA: " + iA + " " + bA);
		System.out.println("double to int");
		iA = (int) dA; //truncates decimal
		System.out.println("dA and iA: " + dA + " " + iA);
		System.out.println("double to byte");
		bA = (byte) dA; // 323 % 256 = 67
		System.out.println("dA and bA: " + dA + " " + bA);
	}
}
