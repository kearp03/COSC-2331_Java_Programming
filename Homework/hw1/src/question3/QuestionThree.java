package question3;

public class QuestionThree {
    public static void main(String args[]){
        int a = 2147483647;
        byte b = 127;

        System.out.println(0B10111);     //prints the binary number 10111 as its decimal equivalent 23
        System.out.println(0345);        //prints the octal number 345 as its decimal equivalent 229
        System.out.println(0xABCD);      //prints the hexadecimal number ABCD as its decimal number 43981
        System.out.println(1/3);         //prints the integer division of 1/3 which is 0
        System.out.println(1/3.0);       //prints the double division of 1/3 which is 0.3333333333333333
        System.out.println(1.0/3);       //prints the double division of 1/3 which is 0.3333333333333333
        System.out.println(1.0f/3.0F);   //prints the float division of 1/3 which is 0.33333334
        System.out.println(123.123E-2);  //uses scientific notation to print the double 1.23123
        System.out.println(a);           //prints the value of the variable a
        System.out.println(b);           //prints the value of the variable b
        b = (byte) (b+1);
        System.out.println(b);           //the addition of 1 to b overflows the positive range of a byte which results in overflow to -128
        a = (int) (a+1);
        System.out.println(a);           //the addition of 1 to a overflows the positive range of an int which results in overflow to -2147483648
        b = (byte) ((-b)+127);
        System.out.println(b);           //-(-128) + 127 = -1 because of byte overflow
        a = (int) ((-a)+2147483647);
        System.out.println(a);           //-(-2147483648) + 2147483647 = -1 because of int overflow
        a = 2147483647;
        b = 127;
        b = (byte) (b+1270);
        System.out.println(b);           //prints (127+1270) % 256 = 117
        a = (int) (a+2147483647);
        System.out.println(a);           //2147483647+2147483647 results in an int overflow to -2
    }
}
