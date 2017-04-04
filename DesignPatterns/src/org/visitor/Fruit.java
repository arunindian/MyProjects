package org.visitor;

public class Fruit implements ItemElement {
	
	private double pricePerKg;
	private float weight;
	private String name;
	
	public Fruit(double pricePerKg,float weight,String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public float getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}

	public void accept(ShoppingCartVisitor visitor) {
		visitor.visit(this);
	}

}
