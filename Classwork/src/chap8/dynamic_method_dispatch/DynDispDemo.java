package chap8.dynamic_method_dispatch;

class Sup {
	void who() {
		System.out.println("who() in Sup");
	}
}

class Sub1 extends Sup {
	void who() {
		System.out.println("who() in Sub1");
	}
}

class Sub2 extends Sup {
	void who() {
		System.out.println("who() in Sub2");
	}
}

public class DynDispDemo {
	public static void main(String[] args) {
		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();
		
		/* In each case, the version of who() to 
		 * call is determined at runtime by the 
		 * type of object being referred to
		 */
		Sup supRef;
		
		supRef = superOb;
		supRef.who();
		
		supRef = subOb1;
		supRef.who();
		
		supRef = subOb2;
		supRef.who();
	}
}