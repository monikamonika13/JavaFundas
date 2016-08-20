package com.java.concepts;

import com.java.concepts.CarParts;
//Understanding static inner class
//You have CarParts & Wheels. 
//All CarParts orders have an id.
//And this show room say has inventory for 10 different wheels from the same factory (one single factoryID)
//But sometimes they have Wheels which are ordered with no id - more like excess inventory for which they don't want to assign a CarPart id
//So now, Wheels as an inner static class of CarParts is useful??
//Because we can create objects of Wheel without creating objects of CarParts??


public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarParts c = new CarParts(777); //When CarParts object is created. an object of Wheels is not created.
		//CarParts.Wheels w1 = new CarParts.Wheels(); //this is possible only if Wheels is a static inner class
	
		CarParts.Wheels w2 = new CarParts(999).new Wheels();
	}

}


