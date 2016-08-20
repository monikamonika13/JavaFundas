package com.java.concepts;

//compile time or static polymorphism - method overloading 
//---- changing return type alone does not constitute overloading. parameters have to be different. 
//runtime or dynamic polymorphism - method overriding in parent and child classes

class X {
	
	void methodX (int m, int n) {
		System.out.println(m + " " + n);
	}
	
	int methodX (int m) {
		System.out.println(m);
		return m;
	}
	
	void methodX (double d) {
		System.out.println(d);
	}
}

class Y extends X {
	int methodX(int m) {
		System.out.println("In class Y methodX... " + m);
		return m;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X objX = new X();
		X objY = new Y();
		Y objY1 = new Y();
		
		//Examples of overloading
		objX.methodX(10); 
		objX.methodX(66, 77);
		objX.methodX(44.5);
		
		//Example of overriding methodX in child class Y
		objY.methodX(3);
		objY.methodX(33,22);
		objY.methodX(99.2);
			
		X objXtemp = objY1;
		objY1 = (Y) objXtemp; //2 step manual down casting
		objY.methodX(45);
		
		objX = objY;
		objX.methodX(10); //up casting
		
	}

}
