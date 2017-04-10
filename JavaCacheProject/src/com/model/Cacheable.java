package com.model;

public interface Cacheable {
	
	/**
	 * By requiring all objects to know their own expirations, the algorithm is abstracted from 
	 * caching service,, there by providing maximum flexibilty as each object and define it own 
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
