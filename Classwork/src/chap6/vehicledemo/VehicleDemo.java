package chap6.vehicledemo;

class Vehicle{
	int passengers, fuelcap, mpg;
}

public class VehicleDemo {
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		int range;
		
		//assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 15;
		minivan.mpg = 10;
		
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range + " miles");
		
		Vehicle sportsCar = new Vehicle();
		
		sportsCar.passengers = 2;
		sportsCar.fuelcap = 50;
		sportsCar.mpg = 6;
		
		range = sportsCar.fuelcap * sportsCar.mpg;
		System.out.println("Sports Car can carry " + sportsCar.passengers + " with a range of " + range + " miles");
	}
}
