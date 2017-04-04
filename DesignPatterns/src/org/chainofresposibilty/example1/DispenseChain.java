package org.chainofresposibilty.example1;

public interface DispenseChain {
	
	void setNextChain(DispenseChain dispenseChain);
	
	void dispense(Currency curr);

}
