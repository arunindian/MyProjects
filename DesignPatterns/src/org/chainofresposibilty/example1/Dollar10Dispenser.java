package org.chainofresposibilty.example1;

public class Dollar10Dispenser implements DispenseChain {
	
	DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain next) {
		this.chain = next;
	}

	@Override
	public void dispense(Currency curr) {
		if(curr.getAmount() > 10) {
			int num = curr.getAmount()/10;
			int remainder = curr.getAmount()%10;
			System.out.println("Number of 10 dollar notes are "+num);
			if(remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		}
	}

}
