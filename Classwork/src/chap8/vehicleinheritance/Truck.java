package chap8.vehicleinheritance;

public class Truck extends Vehicle{
	private int cargoCap; //in pounds
	
	Truck() {//zero-parameter constructor
		//calls constructor in superclass
		super();
	}
	Truck(int cargoCap) {//one-parameterized constructor
		//calls constructor in superclass
		super();
		this.cargoCap = cargoCap;
	}
	
	Truck(int passengers, int fuelcap, int mpg, int cargoCap) {//four-parameterized constructor
		//calls constructor in superclass
		super(passengers, fuelcap, mpg);
		this.cargoCap = cargoCap;
	}
	
	Truck(Truck obj) {//copy constructor
		//calls constructor in superclass
		super(obj);
		this.cargoCap = obj.cargoCap;
	}

	public int getCargoCap() {
		return cargoCap;
	}

	public void setCargoCap(int cargoCap) {
		this.cargoCap = cargoCap;
	}

	@Override
	public String toString() {
		return "Truck [passengers=" + passengers + ", fuelcap=" + fuelcap + ", mpg=" + mpg + ", range=" + range
				+ ", cargoCap=" + cargoCap + "]";
	}
	
}