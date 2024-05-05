package chap6.boxdemo;

class Box{
	double width, height, depth, volume;
	
	void initializeMyBoxObject(){
		initializeMyBoxObject(0,0,0);
	}
	
	void initializeMyBoxObject(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		volume = w*h*d;
	}
}

public class BoxDemo {
	public static void main(String[] args){
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = new Box();
		
		myBox1.initializeMyBoxObject(10.5, 5.5, 2);
//		myBox1.width = 10.5;
//		myBox1.height = 5.5;
//		myBox1.depth = 2;
//		myBox1.volume = myBox1.width * myBox1.height * myBox1.depth;
		
		System.out.println("Box with dimensions " + myBox1.width + " X " + myBox1.height + " X " + myBox1.depth + ":");
		System.out.println("Volume: " + myBox1.volume);
		System.out.println();
		
		myBox2.initializeMyBoxObject(15, 5, 7);
//		myBox2.width = 15;
//		myBox2.height = 5;
//		myBox2.depth = 7;
//		myBox2.volume = myBox2.width * myBox2.height * myBox2.depth;
		
		System.out.println("Box with dimensions " + myBox2.width + " X " + myBox2.height + " X " + myBox2.depth + ":");
		System.out.println("Volume: " + myBox2.volume);
		System.out.println();
		
		myBox3.initializeMyBoxObject(12.4, 10.4, 9);
//		myBox3.width = 12.4;
//		myBox3.height = 10.2;
//		myBox3.depth = 9;
//		myBox3.volume = myBox3.width * myBox3.height * myBox3.depth;
		
		System.out.println("Box with dimensions " + myBox3.width + " X " + myBox3.height + " X " + myBox3.depth + ":");
		System.out.println("Volume: " + myBox3.volume);
	}
}