package chap9.defaultmethods;

interface MyIF {
	/* This is a "normal" interface method declaration.
	 * It does note define a default implementation.*/
	int getUserID();
	
	/* This is a default method. Notice that it provides
	 * a default implementation.*/
	default int getAdminID() {
		return 1;
	}
}

// Implement MyIF
class MyIFImp implements MyIF {
	/* Only getUserID() defined by MyIF needs to be implemented.
	 * getAdminID() can be allowed to be default*/
	public int getUserID() {
		return 100;
	}
}

class MyIFImp2 implements MyIF {
	/* Here, implementations for both getUserID() and getAdminID() are
	 * provided*/
	public int getUserID() {
		return 100;
	}
	
	public int getAdminID() {
		return 42;
	}
}

//Use the default method
public class DefaultMethodDemo {
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		/* Can call getUserID(), because it is expicityly
		 * implemented by MyIFImp*/
		System.out.println("User ID is " + obj.getUserID());
		
		/* Can also call getAdminID(), because of default
		 * implmentation:*/
		System.out.println("Admin ID is " + obj.getAdminID());
		
		MyIFImp2 obj2 = new MyIFImp2();
		
		/* Can call getUserID(), because it is expicityly
		 * implemented by MyIFImp*/
		System.out.println("User ID is " + obj2.getUserID());
		
		/* Can also call getAdminID(), because of default
		 * implmentation:*/
		System.out.println("Admin ID is " + obj2.getAdminID());
		
	}
}