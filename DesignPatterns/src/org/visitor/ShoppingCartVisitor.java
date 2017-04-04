package org.visitor;

public interface ShoppingCartVisitor {
	
	double visit(Fruit fruit);
	double visit(Book book);

}
