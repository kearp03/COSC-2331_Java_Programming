package chap8.vehicleinheritance;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7, 15, 10);
		System.out.println(minivan);
		System.out.println("Fuel needed to travel 100 miles: " + minivan.fuelNeeded(100) + " gallons");
		
		Truck semi = new Truck(4, 100, 50, 4000);
		System.out.println(semi);
		System.out.println("Fuel needed to travel 200 miles: " + semi.fuelNeeded(200) + " gallons");
	}
}