package chap8.vehicleinheritance;

public class Vehicle {
	int passengers, fuelcap, mpg, range;
	
	Vehicle() {//zero-parameter constructor
		
	}

	Vehicle(int val) {//one-parameterized constructor
		this(val, val, val);
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
	
	//Add method to return the range value
	int range() {
		return fuelcap*mpg;
	}
	
	//Add parameterized method to compute the amount of fuel needed for a given distance
	double fuelNeeded(double miles) {
		return miles/mpg;
	}
	
	//Add method to print all instance variables
	@Override
	public String toString() {
		return "Vehicle [passengers=" + passengers + ", fuelcap=" + fuelcap + ", mpg=" + mpg + ", range=" + range + "]";
	}
}