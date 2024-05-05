package lab10.exe1;
import java.util.Scanner;

public class TestClass {
	private static final Scanner scan = new Scanner(System.in);
	private static final int MAX = 100001;
	private static final double dec = 100.0;
	
	public static void main(String[] args) {
		java.util.Random rand = new java.util.Random();
		String[] colors = {"red", "blue", "yellow", "green", "orange", "purple", "brown", "black", "pink", "gray", "white"};
		int N = readInt("Enter number of circles"), 
			M = readInt("Enter number of rectangles"), 
			O = readInt("Enter number of triangles");
		
		//perform dynamic method dispatch or runtime polymorphism by Superclass references
		//and assigning subclass objects
		Figure[] figRef = new Figure[N+M+O];
		
		for(int i = 0; i < figRef.length; i++) {
			//creates N number of Circle objects
			if(i < N) 
				figRef[i] = 
				new Circle(rand.nextInt(0, MAX)/dec, colors[rand.nextInt(colors.length)], false);
			//creates M number of Rectangle objects
			else if(i >= N && i < N+M) 
				figRef[i] = 
				new Rectangle(rand.nextInt(0, MAX)/dec, rand.nextInt(0, MAX)/dec, colors[rand.nextInt(colors.length)], false);
			//creates O number of Triangle objects
			else 
				figRef[i] = 
				new Triangle(rand.nextInt(0, MAX)/dec, rand.nextInt(0, MAX)/dec, rand.nextInt(0, MAX)/dec, colors[rand.nextInt(colors.length)], false);
			//prints each object
			System.out.println(figRef[i]);
		}
	}
	
	public static int readInt(String msg) {
		System.out.print(msg + ": ");
		return scan.nextInt();
	}
}