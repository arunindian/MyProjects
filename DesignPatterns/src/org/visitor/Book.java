package org.visitor;

public class Book implements ItemElement {
	
	private float price;
	private String isbnNumber;
	
	public Book(float price, String isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public float getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void accept(ShoppingCartVisitor visitor) {
		visitor.visit(this);
	}

}
