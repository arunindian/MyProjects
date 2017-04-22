package com.model;

import java.util.Calendar;
import java.util.Date;
/**
 *Defines a generic class which will be used as container to store the cachable object 
 */

public class CachedEntity<T> implements Cacheable{
	
	private T t;
	private String identifier;
	private Date dateOfExpiration;
	
	public CachedEntity(T t,String id,int minutesToLive) {
		this.setT(t);
		this.identifier = id;
		if(minutesToLive != 0) {
			dateOfExpiration = new Date();
			Calendar calender = Calendar.getInstance();
			calender.setTime(dateOfExpiration);
			calender.add(Calendar.MINUTE, minutesToLive);
			dateOfExpiration = calender.getTime();
		}
	}
	
	public String getIdentifier() {
		return this.identifier;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public boolean isExpired() {
		if(dateOfExpiration != null) {
			if(dateOfExpiration.before(new Date())) {
				System.out.println("Expired from cache. Expired Time :" +dateOfExpiration.toString()+ " Current time : "+new Date().toString());
				return true;
			} else {
				System.out.println("Item not expired");
				return false;
			}
		}
		// Item never expires
		return false;
	}
}
