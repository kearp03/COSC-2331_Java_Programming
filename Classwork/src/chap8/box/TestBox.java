package chap8.box;

public class TestBox {
	public static void main(String[] args) {
		BoxWeight myBox = new BoxWeight(1.1, 2.2, 3.3, 4.4);
		
		System.out.println("Width: " + myBox.width);
		System.out.println("Height: " + myBox.height);
		System.out.println("Depth: " + myBox.depth);
		System.out.println("Weight: " + myBox.weight);
		System.out.printf("Volume: %.2f%n%n", myBox.volume());
		
		ColorBox myBox2 = new ColorBox(1.1, 2.2, 3.3, "Red");
		
		System.out.println("Width: " + myBox2.width);
		System.out.println("Height: " + myBox2.height);
		System.out.println("Depth: " + myBox2.depth);
		System.out.println("Color: " + myBox2.color);
		System.out.printf("Volume: %.2f", myBox2.volume());
	}
}
