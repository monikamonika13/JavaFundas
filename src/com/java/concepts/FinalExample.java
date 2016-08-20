package com.java.concepts;

//final access modifier for class, method and variable
//final class cannot be derived from
//final method cannot be overridden
//final variable - once value is assigned, it cannot be changed

public class FinalExample {
	
	static void printName() {
		 Animal a = new Animal("Lion");
		 System.out.println(a.toString());
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  final int x;
		  x = 10;
		  //compilation error on the following, because x is declared as final
		  //x = x + 25;
		  System.out.println(x);
		  printName();
	}
}

final class Animal {
	String name;
	//If constructor is made Private then it is not visible in other classes
	public Animal(String s) {
		this.name = s;
	}
	
	public String toString() {
		return this.name;
	}
}


/* compilation error on the following, because class Animal is declared final
 * class Mammal extends Animal {
 * }
 */


class Bird {
	String name;
	
	public Bird(String s) {
		this.name = s;
	}
	
	public final String toString() {
		return this.name;
	}
}

class Flamingo extends Bird {
	
	//The following constructor is necessary since the parent class has overridden its default constructor
	public Flamingo (String s) {
		super(s);
	}
	
	/* Cannot override final method of parent class
	 * String toString() {
	 *	//blah blah
	 * }
	 */
}
