package question4;
//imports needed classes
import java.util.Scanner;

public class QuestionFour{
    //declares static member variables to use in the class
	private static Scanner scan = new Scanner(System.in);
	//declares final variables for prices and the tax
	public static final int MONITOR_PRICE = 100, KEYBOARD_PRICE = 50, MOUSE_PRICE = 35, CPU_PRICE = 500, RAM_PRICE = 400, SSD_PRICE = 200;
	public static final double TAX = 1.072;
  	//main method
	public static void main(String[] args){
		//loops through menu and subtask until System.out(0); is reached
		while(true){
		    //prints menu
			System.out.println("Menu\n"
					+ "--------------------------------------------------\n"
					+ "Press 1 for Linear equations\n"
					+ "Press 2 for the shopping bill\n"
					+ "Press 3 for directions\n"
					+ "Press 4 for square root and cube root of n numbers\n"
					+ "Press 5 to QUIT");
		    //takes in the users choice
		    int choice = (int) read("");
		    System.out.println();
		    
		    //linear equations problem
		    if(choice == 1) {
		        linSolve();
		    }
		    //shopping bill problem
		    else if(choice == 2){
		        bill();
		    }
		    //directions problem
		    else if(choice == 3){
		        directions();
		    }
		    //square root and cube root problem
		    else if(choice == 4){
		        int n = (int) read("Enter an integer");
		        roots(n);
		    }
		    //exit option
		    else if(choice == 5) System.exit(0);
		    //prints error message if no other option was entered
		    else System.out.println("ERROR: CHOICE NOT RECOGNIZED; PLEASE ENTER AGAIN");
		    System.out.println();
		}
	}
	
	//method to return read double numbers, takes in a string which it uses as a prompt
	public static double read(String prompt){
	    System.out.print(prompt + ": ");
	    return scan.nextDouble();
	}
	
	//method to solve linear systems in two variables
	public static void linSolve(){
	    //prints instructions
		System.out.println("Please enter the coefficients in the following way:");
		System.out.println("ax + by = e \ncx + dy = f");
		//reads all the coefficients
	    double a = read("a");
	    double b = read("b");
	    double c = read("c");
	    double d = read("d");
	    double e = read("e");
	    double f = read("f");
	    
	    //calculates x and y
	    double x = (e*d - b*f) / (a*d - b*c);
	    double y = (a*f - e*c) / (a*d - b*c);
	    
	    //prints results
	    System.out.println("x = " + x + "\ny = " + y);
	}
	
	//method to calculate a shopping bill for various computer parts
	public static void bill(){
	    //reads the quantity of each item
		int monitor = (int) read("monitor(s)");
	    int keyboard = (int) read("keyboard(s)");
	    int mouse = (int) read("mouse(s)");
	    int cpu = (int) read("cpu");
	    int ram = (int) read("ram");
	    int ssd = (int) read("ssd");
	    System.out.println();
	    
	    //calls a method to calculate and print the bill
	    calcAndPrintBill(monitor, keyboard, mouse, cpu, ram, ssd);
	}
	
	//method to calculate and print the shopping bill, takes in the quantities of all the items
	public static void calcAndPrintBill(int monitor, int keyboard, int mouse, int cpu, int ram, int ssd){
	    //calculates the total with and without tax
		int total = monitor*MONITOR_PRICE + keyboard*KEYBOARD_PRICE + mouse*MOUSE_PRICE + cpu*CPU_PRICE + ram*RAM_PRICE + ssd*SSD_PRICE;
	    double taxTotal = Math.round(total * TAX * 100) / 100d;
	    
	    //prints the bill
	    System.out.println("Item\t\t\tQuantity\t\tPrice");
	    System.out.println("Monitor\t\t\t" + monitor + "\t\t\t" + monitor*MONITOR_PRICE);
	    System.out.println("Keyboard\t\t" + keyboard + "\t\t\t" + keyboard*KEYBOARD_PRICE);
	    System.out.println("Mouse\t\t\t" + mouse + "\t\t\t" + mouse*MOUSE_PRICE);
	    System.out.println("CPU\t\t\t" + cpu + "\t\t\t" + cpu*CPU_PRICE);
	    System.out.println("RAM\t\t\t" + ram + "\t\t\t" + ram*RAM_PRICE);
	    System.out.println("SSD\t\t\t" + ssd + "\t\t\t" + ssd*SSD_PRICE);
	    System.out.println("Total:\t\t\t\t\t\t" + total);
	    System.out.println("Total with tax:\t\t\t\t\t" + taxTotal);
	    
	}
	
	//method to generate random numbers and give directions based on that generated number
	public static void directions(){
	    //initializes total_miles variable to 0
		int total_miles = 0;
	    
		//loops through until total_miles is greater than 1000
		while(total_miles <= 1000){
	        //generates the random integer from 10-99
			int current_miles = (int) ((Math.random() * 89) + 10);
	        //prints the current miles
			System.out.print(current_miles + " miles: ");
	        
			//decides the directions based on the generated number
			if(current_miles == 50) System.out.print("RIGHT TURN");
	        else if(current_miles == 60) System.out.print("LEFT TURN");
	        else System.out.print("STRAIGHT");
	        
			//adds the current_miles to the total_miles and prints the total miles traveled
			total_miles += current_miles;
	        System.out.println("\t" + total_miles + " miles traveled");
	    }
	}
	
	//method to print the square root and cube roots of n numbers
	public static void roots(int n){
	    //generates heading
		System.out.printf("%s %20s %25s\n", "Number", "Sqrt", "Cbrt");
	    
		//loops through n numbers and calculates square and cube roots
		for(int i = 1; i <= n; i++){
	        System.out.printf("%s %25s %25s\n", i, Math.sqrt(i), Math.cbrt(i));
	    }
	}
}