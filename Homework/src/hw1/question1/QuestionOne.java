package hw1.question1;

public class QuestionOne {
    public static void main(String[] args){
		//Compile-time error: an error that occurs when the program is being compiled, ie a Java syntax error
		//ex:
		System.out.println("Hello world"); //semicolon goes here
		
		//Run-time error: an error that occurs after compilation, when a program is being run
		//ex:
		//System.out.println(10/0); //divide by zero error
		
		//Logical error: an error due to logical issue with the code; usually doesn't produce an error screen
		//ex:
		if(10 > 9) System.out.println("10 is less than 9"); //code compiles correctly but 10 is not less than 9
	}
}