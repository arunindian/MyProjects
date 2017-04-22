package org.singleton;

/**
 * Prior to java 5 there were lot of java memory model issues because of which in  multi threaded environment
 * event the double checked locking used to fail
 */
public class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	/**
	 * Helper singleton class containing the only instance of the singleton. When BillPugSingleton class is loaded
	 * SingletonHelper is not loaded. Only once getInstance is called the SingletonHelper is loaded and Singleton 
	 * class instance is loaded
	 */
	private static class SingletonHelper{
		private static BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
