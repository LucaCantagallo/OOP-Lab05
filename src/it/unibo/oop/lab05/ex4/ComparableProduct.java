package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.*;

public class ComparableProduct extends ProductImpl implements Product, Comparable<Product>{

	public ComparableProduct (String name, double quantity) {
		super(name, quantity);
	}

	public int compareTo(final Product p) {
		return getName().compareTo(p.getName());
	}
	
		
}
