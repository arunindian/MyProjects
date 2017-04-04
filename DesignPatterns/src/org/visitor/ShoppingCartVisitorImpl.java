package org.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	public double visit(Fruit fruit) {
		double cost = fruit.getWeight()*fruit.getPricePerKg();
		System.out.println("Cost for fruit weight "+fruit.getWeight()+" is "+cost);
		return cost;
	}

	public double visit(Book book) {
		double cost=0;
		if(book.getPrice() > 50) {
			cost = book.getPrice()-5;
		} else {
			cost = book.getPrice();
		}
		return cost;
	}

}
