package org.singleton;

/**
 * Here we make singleton class thread safe by synchronizing the global access method.
 * So that only one thread can execute the getInstance method at a times. This method
 * provides thread safety but it reduces the performance because of the cost associated
 * with the synchronized method.Although we need the synchronized block only for the
 * first few threads where additional instances can get created. So there is extra overhead
 * every time.
 *
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}
}
