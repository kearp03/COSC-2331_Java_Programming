package lab4.practice;
import java.util.Random;

public class RandomPalindromePractice {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int num = rand.nextInt(1000);
			int n = num;
			System.out.println(num);
			int reverse = 0;
			while(n > 0) {
				reverse = reverse*10 + (n % 10);
				n /= 10;
			}
			
			System.out.println(reverse);
			if(num == reverse) System.out.println("Palindrome");
			else System.out.println("Not Palindrome");
			System.out.println();
		}
	}
}