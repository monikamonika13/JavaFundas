package com.java.concepts;

class Animals { }

class Mammal extends Animals { }

class Cat extends Mammal { }

class Dog extends Mammal { }

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m = new Mammal();
		Cat c = new Cat();
		System.out.println("Upcasting\n-----------");
		//upcasting cat as a mammal
		System.out.println("Cat : " + c);
		Mammal m1 = c; 
		Mammal m2 = new Cat(); 
		System.out.println("Mammal : " + m1);
		System.out.println("Mammal : " + m2);
		//Dog d1 = new Animals(); //--- this is not allowed
		//Dog d1 = c; //--- this is not allowed either
		
		System.out.println("\nDownCasting\n-----------");
		//downcasting animal as a dog
		Animals a = new Animals();
		if (a instanceof Dog) {
			Dog d = (Dog) a; //this as such will throw java.lang.ClassCastException
			System.out.println(a);
			System.out.println(d);
		}
		
		//the following downcasting BACK to dog will work
		//note that you can downcast after upcasting. cannot downcast a new parent to the child.
		Dog d1 = new Dog();
		Animals a1 = d1; //upcasting dog to an animal
		if (a1 instanceof Dog){
			d1 = (Dog) a1; //downcasting back to dog
			System.out.println(a1);
			System.out.println(d1);
		}
		
	}

}
