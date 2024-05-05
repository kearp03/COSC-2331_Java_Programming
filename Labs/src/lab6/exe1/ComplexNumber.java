package lab6.exe1;

public class ComplexNumber {
	//private fields
	private int real, imaginary;
	
	//overloaded constructors
	//zero parameters
	ComplexNumber() {
		this(0);
	}
	
	//one parameter
	ComplexNumber(int v) {
		this(v,v);
	}
	
	//one parameter copy constructor
	ComplexNumber(ComplexNumber CN) {
		this(CN.real, CN.imaginary);
	}
	
	//two parameter
	ComplexNumber(int r, int i) {
		setReal(r);
		setImaginary(i);
	}
	
	//getters and setters to operate on private fields
	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	//overloaded addComp methods
	public static void addComp(int a, ComplexNumber CN1) {
		CN1.real += a;
	}
	
	public void addComp(ComplexNumber CN1) {
		addComp(this, CN1);
	}
	
	public static void addComp(ComplexNumber CN1, ComplexNumber CN2) {
		CN1.real += CN2.real;
		CN1.imaginary += CN2.imaginary;
	}
	
	//Overloaded multComp methods
	public static void multComp(int a, ComplexNumber CN1) {
		CN1.real *= a;
		CN1.imaginary *= a;
	}
	
	public void multComp(ComplexNumber CN1) {
		multComp(this, CN1);
	}
	
	public static void multComp(ComplexNumber CN1, ComplexNumber CN2) {
		CN1.real = (CN1.real * CN2.real) - (CN1.imaginary * CN2.imaginary);
		CN1.imaginary = (CN1.imaginary * CN2.real) + (CN1.real * CN2.imaginary);
	}
	
	//display method
	public void display() {
		System.out.println(this.real + " + " + this.imaginary + "i");
	}
	
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}