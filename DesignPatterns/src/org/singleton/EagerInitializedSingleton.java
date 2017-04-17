package org.singleton;

/**
 * 
 * Here the instance of class is created at the time of class loading
 * 
 * Drawback : Instance is created even before client is using it.
 * 
 * If singleton do not uses lot of resources then this is right way as not much pressure on JVM memory.
 * 
 * But in most of the cases the singletons are used for resource intensive resources objects such as Database Connection,
 * File System
 */
public class EagerInitializedSingleton {
	
	// Only instance of class in the JVM
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	// Private constructor
	private EagerInitializedSingleton() {}
	
	/**
	 * Method to return the only instance
	 */
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
