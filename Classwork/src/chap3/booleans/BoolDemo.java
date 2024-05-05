package chap3.booleans;

public class BoolDemo{
	public static void main(String[] args){
	    boolean b;
	    b = false;
	    System.out.println("b is: " + b);
	    b = true;
	    System.out.println("b is: " + b);
	    //only boolean values can be used as follows
	    if(b){
	        System.out.println("b is: " + b);
	    }
        b = false; 
        if(b){
	        System.out.println("b is: " + b);
        }
        System.out.println("10 > 9 is: " + (10 > 9));
        System.out.println("10 < 9 is: " + (10 < 9));
        System.out.println("10 != 9 is: " + (10 != 9));
        System.out.println("10 == 9 is: " + (10 == 9));
        System.out.println("10 >= 10 is: " + (10 >= 10));
        System.out.println("10 <= 10 is: " + (10 <= 10));
	}
}
