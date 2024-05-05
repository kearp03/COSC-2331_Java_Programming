package lab6.exe1;

public class ComplexNumberDemo {
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber();
		ComplexNumber cn2 = new ComplexNumber(3);
		ComplexNumber cn3 = new ComplexNumber(4, 7);
		ComplexNumber cn4 = new ComplexNumber(cn3);
		
		System.out.println("Complex Number CN1: " + cn1);
		System.out.println("Complex Number CN2: " + cn2);
		System.out.println("Complex Number CN3: " + cn3);
		System.out.println("Complex Number CN4: " + cn4);
		
		System.out.println();
		
		System.out.println("CN1 + 5:");
		ComplexNumber.addComp(5, cn1);
		System.out.println(cn1);
		
		System.out.println();
		
		System.out.println("CN 2 + CN 3:");
		ComplexNumber.addComp(cn2, cn3);
		System.out.println(cn2);
		
		System.out.println();
		
		System.out.println("CN 3 + CN 4:");
		cn3.addComp(cn4);
		System.out.println(cn3);
	}
}