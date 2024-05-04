class XYZ {//A, G
    double a; //E
    double b; //E
    double c; //E
    double d; //E
    
    XYZ() {//I: No argument constructor
        a = 0.0;
        b = 1.0;
        c = 0.0;
        d = 1.0;
    }
    
    XYZ(double a) {//I: Parameterized Constructor, J, K
        this.a = this.b = this.c = this.d = a;
    }
    
    XYZ(double a1, double a2, double a3, double a4) {//I: Parameterized Constructor, J, K
        a = a1;
        b = a2;
        c = a3;
        d = a4;
    }
    
    void prodAll() {//F
        this.d = this.a*this.b*this.c;  //Explain this keyword role here
        //The this keyword points to the object that calls this method
    }
    
    void printProdAll() {//F
        System.out.println("a = "+this.a+" b = "+b+" c = "+this.c+" \nproduct d = "+d);
    }
}

public class XYZDemo {//A
    public static void main(String args[]) {
        XYZ A1;						//B, C
        A1 = new XYZ();				//D
        XYZ A2 = new XYZ();			//B, D
        XYZ A3;						//B, C
        A3 = new XYZ(10);			//D
        XYZ A4 = new XYZ(1,2,3,4);	//B, D
        XYZ A5 = A4;				//B, D, H
        A1.printProdAll();
        A2.printProdAll();
        A3.printProdAll();
        A4.printProdAll();  //why identical results here and from next line
        A5.printProdAll();	//A4 and A5 point to the same object
        A1.prodAll();
        A2.prodAll();
        A3.prodAll();
        A4.prodAll();
        A5.prodAll();
        A1.printProdAll();
        A2.printProdAll();
        A3.printProdAll();
        A4.printProdAll(); 	//why identical results here and from next line
        A5.printProdAll();	//A4 and A5 point to the same object
    }
}