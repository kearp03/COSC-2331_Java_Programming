package chap3.characters;

public class CharDemo{
	public static void main(String[] args){
		char ch1, ch2;
		ch1 = 88; //Can use integers to represent char-Unicode
		ch2 = 'Y'; //char constant
		System.out.println("ch1 and ch2 are: " + ch1 + " " + ch2);
		ch1++; //chars are affected by arithmetic operators
		System.out.println("ch1 and ch2 are: " + ch1 + " " + ch2);
		ch2++;
		System.out.println("ch1 and ch2 are: " + ch1 + " " + ch2);
	}
}
