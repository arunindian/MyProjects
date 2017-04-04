package org.visitor.example1;

public interface ShoppingCartVisitor {
	
	double visit(Fruit fruit);
	double visit(Book book);

}
