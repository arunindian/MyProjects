package org.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Here we are getting one instance. Now we are getting the other instance which has a different hashCode and thus 
 * destroys the Singleton pattern
 */
public class ReflectionSingletonTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerInitializedSingleton instanceOne  = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo  = null;
		
		Constructor[] construtors = EagerInitializedSingleton.class.getDeclaredConstructors();
		for(Constructor construtor : construtors) {
			construtor.setAccessible(true);
			instanceTwo = (EagerInitializedSingleton) construtor.newInstance();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
