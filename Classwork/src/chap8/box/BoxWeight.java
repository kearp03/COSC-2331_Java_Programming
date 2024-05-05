package chap8.box;

//create an extension of Box class with double field weight
//adds superclass constructor call
public class BoxWeight extends Box {
	double weight;
	
	BoxWeight(double width, double height, double depth, double weight) {
		//calls superclass constructor
		super(width, height, depth);
		this.weight = weight;
		System.out.println("Four param in BoxWeight class");
	}
}