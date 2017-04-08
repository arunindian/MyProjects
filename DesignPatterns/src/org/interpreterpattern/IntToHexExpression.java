package org.interpreterpattern;

public class IntToHexExpression implements Expression {
	
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexString(i);
	}
}
