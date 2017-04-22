package com.model;

/**
 * Defines all the method that will be placed in the cache
 */
public interface Cacheable {
	
	/**
	 * By requiring all objects to know their own expirations, the Expiring algorithm is abstracted from 
	 * caching service, there by providing maximum flexibilty as each object can define it own 
	 * expiration strategy
	 * 
	 */
	public boolean isExpired();
	
	/**
	 * This will make sure that caching service is not responsible for uniquely identifying each 
	 * object placed in the cache
	 * 
	 */
	public Object getIdentifier();

}
