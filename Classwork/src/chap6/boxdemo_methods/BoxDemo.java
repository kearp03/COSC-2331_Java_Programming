package chap6.boxdemo_methods;
import java.util.Scanner;

class Box{
	double width, height, depth, volume;
	private Scanner scan;
	
	//Add overloaded constructors 
	//Add constructor chaining
	Box() {//zero-parameterized Constructor
		this(-1);
	}
	
	Box(double width) {//one-parameterized Constructor
		this(width, width, width);
	}
	
	Box(double width, double height, double depth) {//three-parameterized Constructor
		this.width = width;
		this.height = height;
		this.depth = depth;
		calcVolume();
		
	}
	
	Box(Box obj) {//copy constructor
		this(obj.width, obj.height, obj.depth);
	}
	
	//Add method to read the class instance variable for Box Class instance
	void readVar() {
		scan = new Scanner(System.in);
		System.out.print("Width: ");
		this.width = scan.nextDouble();
		System.out.print("Height: ");
		this.height = scan.nextDouble();
		System.out.print("Depth: ");
		this.depth = scan.nextDouble();
		this.volume = calcVolume();
	}
	
	//Add method to print the class instance variables for Box class instance
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + ", volume=" + volume + "]";
	}

	//Add method to return the calculated volume
	double calcVolume() {
		return width * height * depth;
	}
}

public class BoxDemo {
	public static void main(String[] args){
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = new Box();
		
		Box boxes[] = {myBox1, myBox2, myBox3};
		
		for(Box currentBox : boxes) {
			currentBox.readVar();
			System.out.println(currentBox);
		}
	}
}