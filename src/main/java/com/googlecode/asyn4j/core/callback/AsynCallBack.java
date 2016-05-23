package com.googlecode.asyn4j.core.callback;

import java.io.Serializable;

/**
 * 
 * @author pan_java
 *
 */
public abstract class AsynCallBack implements Runnable,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -412453938122529103L;
	
	protected Object methodResult;

	@Override
	public void run() {
		doNotify();
	}

	public final void setInokeResult(Object object) {
		// set method inoke result
		this.methodResult = object;
	}

	/**
	 * execute callback
	 */
	public abstract void doNotify();

}
