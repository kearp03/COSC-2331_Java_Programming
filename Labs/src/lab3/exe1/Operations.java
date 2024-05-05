package lab3.exe1;
import java.util.Scanner;

public class Operations{
	//declares and initializes Scanner object scan to be used throughout the class
	public static Scanner scan = new Scanner(System.in);
	
	//main method
	public static void main(String[] args){
		//declares variables
		char cChoice;
		int operand1 = 0, operand2 = 0;
		//creates infinite loop; only way to exit is if cChoice is 'Q'
		while(true){
			//calls displayMenu method and records choice in cChoice
			cChoice = displayMenu();
			System.out.println();
			//quits if cChoice is Q
			if(cChoice == 'Q') System.exit(0);
			
			//if the choice is a unary operator, only reads one operand
			if(cChoice >= 54 && cChoice <= 57){
				operand1 = readValue("Enter a value: ");
			}
			//else reads two operands
			else{
				operand1 = readValue("Enter a value: ");
				operand2 = readValue("Enter a value: ");
			}
			
			System.out.println();
			
			//sets switch statement where each case is one of the operations
			switch(cChoice){
			case '+':
				//puts the result of add in result prints it and breaks the switch statement
				displayResult(String.valueOf(cChoice), operand1, operand2, add(operand1, operand2)); break;
			
			case '-':
				//puts the result of add with negative second operator in result prints it and breaks the switch statement
				displayResult(String.valueOf(cChoice), operand1, operand2, add(operand1, -operand2)); break;
			
			case '*':
				//puts the result of mult in result prints it and breaks the switch statement
				displayResult(String.valueOf(cChoice), operand1, operand2, mult(operand1, operand2)); break;
			
			case '/':
				//checks the divisor, puts the result of div in result prints it and breaks the switch statement
				displayResult(String.valueOf(cChoice), operand1, validateDivisor(operand2), div(operand1, operand2)); break;
			
			case '%':
				//checks the divisor, puts the result of mod in result prints it and breaks the switch statement
				displayResult(String.valueOf(cChoice), operand1, validateDivisor(operand2), mod(operand1, operand2)); break;
			
			case '1':
				//puts the result of shortAdd in result prints it and breaks the switch statement
				displayResult("+=", operand1, operand2, shortAdd(operand1, operand2)); break;
			
			case '2':
				//puts the result of shortSub in result prints it and breaks the switch statement
				displayResult("-=", operand1, operand2, shortAdd(operand1, -operand2)); break;
			
			case '3':
				//puts the result of shortMul in result prints it and breaks the switch statement
				displayResult("*=", operand1, operand2, shortMul(operand1, operand2)); break;
			
			case '4':
				//checks the divisor, puts the result of shortDiv in result prints it and breaks the switch statement
				displayResult("/=", operand1, validateDivisor(operand2), shortDiv(operand1, operand2)); break;
			
			case '5':
				//checks the divisor, puts the result of shortMod in result prints it and breaks the switch statement
				displayResult("%=", operand1, validateDivisor(operand2), shortMod(operand1, operand2)); break;
			
			case '6':
				//puts the result of postInc in result prints it and breaks the switch statement
				displayResult(operand1, postInc(operand1), "++", 0); break;
			
			case '7':
				//puts the result of postDec in result prints it and breaks the switch statement
				displayResult(operand1, postDec(operand1), "--", 0); break;
			
			case '8':
				//puts the result of preInc in result prints it and breaks the switch statement
				displayResult(operand1, preInc(operand1), "++", 1); break;
			
			case '9':
				//puts the result of preDec in result and breaks the switch statement
				displayResult(operand1, preDec(operand1), "--", 1); break;
			}
			
			System.out.println();
		}
	}
	
	//method to display the menu and returns the choice chosen
	public static char displayMenu(){
		System.out.println("Menu:\n"
				+ "------------------------------------\n"
				+ "Press + for addition\n"
				+ "Press - for subtraction\n"
				+ "Press * for multiplication\n"
				+ "Press / for division\n"
				+ "Press % for modulus\n"
				+ "Press 1 for shorthand addition\n"
				+ "Press 2 for shorthand subtraction\n"
				+ "Press 3 for shorthand multiplication\n"
				+ "Press 4 for shorthand division\n"
				+ "Press 5 for shorthand modulus\n"
				+ "Press 6 for post-increment\n"
				+ "Press 7 for post-decrement\n"
				+ "Press 8 for pre-increment\n"
				+ "Press 9 for pre-decrement\n"
				+ "Press Q for QUIT");
		//reads and returns the value of iChoice
		char cChoice = readCharValue("Enter your choice of Operation: ");
		return cChoice;
	}
	
	//method to read an integer value
	public static int readValue(String msg){
		System.out.print(msg);
		return scan.nextInt();
	}
	
	//method to read char values and loops until the char value is one of the correct options
	public static char readCharValue(String msg){
		char cChoice;
		do{
			System.out.print(msg);
			cChoice = scan.next().charAt(0);
		}while(validateInput(cChoice));
		return cChoice;
	}
	
	//validates the char input so it matches one of the menu options
	public static boolean validateInput(char choice){
		if(choice == '+' || choice == '-' || choice == '*' || choice == '/' || choice == '%' || choice == '1' || choice == '2' || choice == '3')
			return false;
		if(choice == '4' || choice == '5' || choice == '6' || choice == '7' || choice == '8' || choice == '9' || choice == 'Q')
			return false;
		
		return true;
	}
	
	//method to display the results of the binary operations
	public static void displayResult(String cChoice, int operand1, int operand2, double result){
		System.out.println(operand1 + " " + cChoice + " " + operand2 + " = " + result);
	}
	
	//method to display the results of the unary operations
	public static void displayResult(int operand, double result, String cChoice, int position){
		if(position == 0) System.out.println(operand + cChoice + " = " + result);
		else if(position == 1) System.out.println(cChoice + operand + " = " + result);
	}
	
	//method to perform addition
	public static int add(int operand1, int operand2){
		return operand1 + operand2;
	}
	
	//method to perform multiply
	public static int mult(int operand1, int operand2){
		return operand1 * operand2;
	}
	
	//method to perform division
	public static double div(double operand1, double operand2){
		return operand1 / operand2;
	}
	
	//method to perform modulus
	public static int mod(int operand1, int operand2){
		return operand1 % operand2;
	}
	
	//method to perform addition assignment
	public static int shortAdd(int operand1, int operand2){
		operand1 += operand2;
		return operand1;
	}
	
	//method to perform multiplication assignment
	public static int shortMul(int operand1, int operand2){
		operand1 *= operand2;
		return operand1;
	}
	
	//method to perform division assignment
	public static double shortDiv(double operand1, double operand2){
		operand1 /= operand2;
		return operand1;
	}
	
	//method to perform modulo assignment
	public static int shortMod(int operand1, int operand2){
		operand1 %= operand2;
		return operand1;
	}
	
	//method to perform post-increment unary operator
	public static int postInc(int operand){
		operand++;
		return operand;
	}
	
	//method to perform post-decrement unary operator
	public static int postDec(int operand){
		operand--;
		return operand;
	}
	
	//method to perform pre-increment unary operator
	public static int preInc(int operand){
		++operand;
		return operand;
	}
	
	//method to perform pre-decrement unary operator
	public static int preDec(int operand){
		--operand;
		return operand;
	}
	
	//validates divisor
	public static int validateDivisor(int operand){
		while(operand == 0){
			System.out.print("Error: Denominator 0\nEnter another value: ");
			operand = scan.nextInt();
		}
		return operand;
	}
}