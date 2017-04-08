package org.interpreterpattern;

public class IntToBinaryExpression implements Expression{

	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryString(i);
	}

}
