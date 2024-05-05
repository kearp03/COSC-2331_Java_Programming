package chap6.vehicledemo_methods;
import java.util.Scanner;

class Vehicle {
	int passengers, fuelcap, mpg, range;
	private Scanner scan;
	
	//Add overloaded constructors 
	//Add constructor chaining
	Vehicle() {//zero-argument constructor
		this(0);
	}

	Vehicle(int passengers) {//one-parameterized constructor
		this(passengers, 0);
	}
	
	Vehicle(int passengers, int fuelcap) {//two-parameterized constructor
		this(passengers, fuelcap, 0);
	}
	
	Vehicle(int passengers, int fuelcap, int mpg) {//three-parameterized constructor
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
		range = range();
	}
	
	Vehicle(Vehicle obj) {//copy constructor
		this(obj.passengers, obj.fuelcap, obj.mpg);
	}
	
	void readVar() {
		scan = new Scanner(System.in);
		System.out.print("Number of passengers: ");
		passengers = scan.nextInt();
		System.out.print("Fuel capacity: ");
		fuelcap = scan.nextInt();
		System.out.print("mpg: ");
		mpg = scan.nextInt();
		range = range();
	}
	
	//Add method to return the range value
	int range() {
		return fuelcap*mpg;
	}
	
	//Add parameterized method to compute the amount of fuel needed for a given distance
	double fuelNeeded(int miles) {
		return (double)miles/mpg;
	}
	
	//Add method to print all instance variables
	@Override
	public String toString() {
		return "Vehicle [passengers=" + passengers + ", fuelcap=" + fuelcap + ", mpg=" + mpg + ", range=" + range + "]";
	}
}

public class VehicleDemo {
	public static void main(String args[]){
		Vehicle minivan = new Vehicle(7, 15, 10);
		Vehicle sportsCar = new Vehicle(2, 50, 6);
		Vehicle bus = new Vehicle();
		bus.readVar();
		
		Vehicle[] vehicles = {minivan, sportsCar, bus};
		
		for(Vehicle current : vehicles) {
			System.out.println(current);
			System.out.println(current.fuelNeeded(100) + " gallons needed to travel 100 miles");
		}
	}
}