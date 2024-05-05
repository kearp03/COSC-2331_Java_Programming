package lab7.exe1;
import java.util.Scanner;

public class Volume {
	//class member fields
	private String sShape;
	private double dLength, dWidth, dHeight, dRadius, dVolume;
	static double dPI;
	static int countObject;
	private final static Scanner scan = new Scanner(System.in);
	
	//static block to initialize dPI and countObject
	static {
		dPI = Math.PI;
		countObject = 0;
	}
	
	/* constructor overloading and chaining 
	 * last argument in chain is a ternary operator that reads the next field if it is needed 
	 * for that particular shape, otherwise it passes zero
	 * increments countObject by one each time an object is created
	 */
	
	Volume() {
		countObject++;
	}
	
	Volume(String sShape) {
		this(sShape.toLowerCase(), 
			(sShape.toLowerCase().equals("cube") || sShape.toLowerCase().equals("cuboid")) 
				? readD("Length") 
				: 0);
	}
	
	Volume(String sShape, double dLength) {
		this(sShape.toLowerCase(), dLength, 
			sShape.toLowerCase().equals("cuboid") 
				? readD("Width") 
				: 0);
	}
	
	Volume(String sShape, double dLength, double dWidth) {
		this(sShape.toLowerCase(), dLength, dWidth, 
			(sShape.toLowerCase().equals("cuboid") || sShape.toLowerCase().equals("cylinder") || sShape.toLowerCase().equals("cone")) 
				? readD("Height") 
				: 0);
	}
	
	Volume(String sShape, double dLength, double dWidth, double dHeight) {
		this(sShape.toLowerCase(), dLength, dWidth, dHeight, 
			(sShape.toLowerCase().equals("sphere") || sShape.toLowerCase().equals("cylinder") || sShape.toLowerCase().equals("cone")) 
				? readD("Radius") 
				: 0);
	}
	
	Volume(String sShape, double dLength, double dWidth, double dHeight, double dRadius) {
		this.setsShape(sShape.toLowerCase());
		if(sShape.toLowerCase().equals("cube")) {
			this.setdLength(dLength);
			this.setdWidth(dLength);
			this.setdHeight(dLength);
		}
		else {
			this.setdLength(dLength);
			this.setdWidth(dWidth);
			this.setdHeight(dHeight);
		}
		this.setdRadius(dRadius);
		this.compVolume();
		countObject++;
	}
	
	//method to read double values, prints out the message and then returns user input
	static double readD(String msg) {
		System.out.print(msg + ": ");
		return scan.nextDouble();
	}
	
	//method to compute volume
	//uses switch case to choose the right formula
	void compVolume() {
		switch(this.sShape.toLowerCase()) {
			case("cube"):
				dVolume = Math.pow(dLength, 3);
				break;
			case("cuboid"):
				dVolume = (this.dLength * this.dWidth * this.dHeight);
				break;
			case("sphere"):
				dVolume = (4.0/3.0 * dPI * Math.pow(this.dRadius, 3));
				break;
			case("cylinder"):
				dVolume = (dPI * this.dHeight * Math.pow(this.dRadius, 2));
				break;
			case("cone"):
				dVolume = (1.0/3.0 * dPI * this.dHeight * Math.pow(this.dRadius, 2));
				break;
			default:
				System.out.println("ERROR: Cannot calculate volume of " + sShape);
				dVolume = -1;
			}
	}
	
	//generated toString method
	@Override
	public String toString() {
		return "Volume [sShape=" + sShape.toLowerCase() + ", dLength=" + dLength + ", dWidth=" + dWidth + ", dHeight=" 
				+ dHeight + ", dRadius=" + dRadius + ", dVolume=" + Math.round(dVolume*Math.pow(10, 4)) / Math.pow(10, 4) 
				+ ", countObject=" + countObject +"]";
	}
	
	//generated getters and setters
	public String getsShape() {
		return sShape;
	}
	
	public void setsShape(String sShape) {
		this.sShape = sShape;
	}
	
	public double getdLength() {
		return dLength;
	}
	
	public void setdLength(double dLength) {
		this.dLength = dLength;
	}
	
	public double getdWidth() {
		return dWidth;
	}
	
	public void setdWidth(double dWidth) {
		this.dWidth = dWidth;
	}
	
	public double getdHeight() {
		return dHeight;
	}
	
	public void setdHeight(double dHeight) {
		this.dHeight = dHeight;
	}
	
	public double getdRadius() {
		return dRadius;
	}
	
	public void setdRadius(double dRadius) {
		this.dRadius = dRadius;
	}	
}