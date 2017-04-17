package org.singleton;
/**
 * LazyInitializedSingleton for initializing the singleton class Lazyly
 *
 */
public class LazyInitializedSingleton {
	
	/**
	 * The only instance of the singleton class
	 */
	private static LazyInitializedSingleton instance;
	
	/**
	 * private constructor for avoiding its instantiation from outside of this class
	 */
	private LazyInitializedSingleton() {}
	
	/**
	 * For single threaded environment this system works fine but for multithreaded system, if multiple threads 
	 * are inside the if block at the same time.It will destroy the singleton pattern and each thread gets a 
	 * different instance
	 */
	public LazyInitializedSingleton getInstance() {
		
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		
		return instance;
	}
	

}
