package chap8.box;

/*create a Box class with fields width, height, and depth, 
 * and method volume which returns the volume. 
 * Then create an extension of the Box class called BoxWeight 
 * which has field weight
 */
public class Box {
	double width, height, depth;
	
	Box() {
		this(0);
		System.out.println("Zero param in Box class");
	}
	
	Box(double width) {
		this(width, width, width);
		System.out.println("One param in Box class");
	}
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		System.out.println("Four param in Box class");
	}
	
	Box(Box obj) {
		this(obj.width, obj.height, obj.depth);
		System.out.println("Copy constructor in Box class");
	}
	
	public double volume() {
		return this.width * this.height * this.depth;
	}
}