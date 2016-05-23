
package com.googlecode.asyn4j.exception;

import java.io.PrintStream;

/**
 * TODO Comment of Asyn4jException
 * 
 * @author pan_java
 * @version Asyn4jException.java 2010-8-27 下午06:55:31
 */
public class Asyn4jException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 383871777108677902L;

	/**
	 * Constructs an <code>FileTypeException</code> with no detail message.
	 */
	public Asyn4jException() {
		super();
	}

	/**
	 * Constructs an <code>FileTypeException</code> with the specified detail
	 * message.
	 *
	 * @param s
	 *            the detail message.
	 */
	public Asyn4jException(String s) {
		super(s);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}
    
}
