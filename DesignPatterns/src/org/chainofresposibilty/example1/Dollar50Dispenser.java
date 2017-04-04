package org.chainofresposibilty.example1;

public class Dollar50Dispenser implements DispenseChain {
	
	DispenseChain chain;

	public void setNextChain(DispenseChain dispenseChain) {
		this.chain = dispenseChain;
	}

	public void dispense(Currency curr) {
			if(curr.getAmount() >= 50){
				int num = curr.getAmount()/50;
				int remainder = curr.getAmount()%50;
				System.out.println("Dispensing "+num+" notes of 50$");
				if(remainder != 0) {
					this.chain.dispense(curr);
				}
			} else {
				this.chain.dispense(curr);
			}
	}

}
