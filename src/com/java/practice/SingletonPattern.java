package com.java.practice;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

//private constructor
//public getter method to create the logger only if the instance is null
public class SingletonPattern {
	
	public static SingletonPattern sp = null;
	public static Logger _mylogger;
	
	private SingletonPattern() {
		//empty private constructor
	}
	
	public static SingletonPattern get_myLogger() {
		if (null == sp) {
			sp = new SingletonPattern();	
			_mylogger = Logger.getRootLogger();
			_mylogger.setLevel(Level.DEBUG);
		}
		return sp;
	}
	
}
