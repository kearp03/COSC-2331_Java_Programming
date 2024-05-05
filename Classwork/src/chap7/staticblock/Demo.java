package chap7.staticblock;

/* Create a class Demo whit tow static double variables and define a static block
 *  to initialize the static variables by classing Math class sqrt functions with printing a
 *  message as "static block". Define a zero parameterized constructor  printing a message "constructor". In TestDemo class create an object and print both static variables
 *  of class Demo
 */

public class Demo {
	static double var1, var2;
	
	static {
		System.out.println("Static block initially var1: " + var1 + " var2: " + var2);
		var1 = Math.sqrt(16);
		var2 = Math.sqrt(4);
		System.out.println("Static block var1: " + var1 + " var2: " + var2);
	}
	
	Demo() {
		System.out.println("Constructor");
	}
}
