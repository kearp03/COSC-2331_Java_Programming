package lab7.exe1;
import java.util.Scanner;

public class VolumeDemo {
	//prepares a Scanner object
	private final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//creates an object of Volume without assigning memory
		Volume shape;
		
		//loops until System.exit(0) is reached which is case 6
		while(true) {
			//calls method to print the menu and returns the user input
			int choice = menu();
			//switch case to choose right constructor call
			switch(choice) {
				case(1):
					//assigns new memory to shape with sShape as "cube" and prints the object
					shape = new Volume("cube");
					System.out.println(shape);
					break;
				case(2):
					//assigns new memory to shape with sShape as "cuboid" and prints the object
					shape = new Volume("cuboid");
					System.out.println(shape);
					break;
				case(3):
					//assigns new memory to shape with sShape as "sphere" and prints the object
					shape = new Volume("sphere");
					System.out.println(shape);
					break;
				case(4):
					//assigns new memory to shape with sShape as "cylinder" and prints the object
					shape = new Volume("cylinder");
					System.out.println(shape);
					break;
				case(5):
					//assigns new memory to shape with sShape as "cone" and prints the object
					shape = new Volume("cone");
					System.out.println(shape);
					break;
				case(6):
					scan.nextLine();
					System.out.print("Enter shape name: ");
					shape = new Volume(scan.nextLine());
					System.out.println(shape);
					break;
					
				case(7):
					//terminates program
					System.exit(0);
			}
		}
	}
	
	//method to print menu and returns users' option
	static int menu() {
		//loops through menu until return statement is reached
		while(true) {	
			System.out.println("Menu\n"
					+ "1) Cube\n"
					+ "2) Cuboid\n"
					+ "3) Sphere\n"
					+ "4) Cylinder\n"
					+ "5) Cone\n"
					+ "6) Other Shape\n"
					+ "7) Quit");
			//reads user input
			int choice = readI("");
			//returns user input if it's in the range of options
			if(choice >= 1 && choice <= 7) return choice;
			//prints error message and lets user choose a correct option
			else System.out.println("Enter again\n");
		}
	}
	
	//method to read integer inputs
	static int readI(String msg) {
		System.out.print(msg + ": ");
		return scan.nextInt();
	}
}