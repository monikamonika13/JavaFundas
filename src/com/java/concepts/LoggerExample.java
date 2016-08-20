package com.java.concepts;

import org.apache.log4j.Logger;

public class LoggerExample {

	static Logger _log = Logger.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_log.error("This is a test class for Logger");

	}

}
