package org.chainofresposibilty.example1;

public class Dollar20Dispenser {
	
	DispenseChain chain;
	
	public void setNextDispenser(DispenseChain next) {
		this.chain = next;
	}
	
	public void dispense(Currency curr) {
		if(curr.getAmount() > 20) {
			int num = curr.getAmount()/20;
			int remainder = curr.getAmount()%20;
			System.out.println("Number of 20 dollar notes "+num);
			if(remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		}
	}
}
