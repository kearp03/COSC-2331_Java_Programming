package chap3.scope;

class Scope{
	public static void main(String args[])
	{//outer scope
		int i,a; // visible to entire code with the main
		a=10;
		System.out.println("OUTER SCOPE START\n");
		
		{//inner scope 1
			System.out.println("INNER SCOPE 1 START\n");
			//int a;//not possible
			int b=2;//visible within this curly braces (inner scope 1)
			a = a * b; // a is visible here
			System.out.println("b is " + b);
			System.out.println("a is " + a);
			System.out.println("INNER SCOPE 1 ENDS\n");
		}//inner scope ends
		System.out.println("OUTER SCOPE\n");
		System.out.println("a is " + a);
		//System.out.println("b is " + b);
		
		for(i = 0; i < 3; i++) 
		{//inner scope 2
			System.out.println("INNER SCOPE 2 START\n");
			int c = 555; // vissible only iniside the inner scope 2
			//in each iteration c get initialized to 555
			System.out.println("c is " + c);
			c = a;
			System.out.println("c is now " + c);
			System.out.println("INNER SCOPE 2 ENDS\n");
		}//end of inner scope 2
		System.out.println("OUTER SCOPE ENDS\n");
	}//outer scope ends
}