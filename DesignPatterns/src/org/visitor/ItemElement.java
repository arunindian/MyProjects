package org.visitor;

public interface ItemElement {
	
	void accept(ShoppingCartVisitor visitor);

}
