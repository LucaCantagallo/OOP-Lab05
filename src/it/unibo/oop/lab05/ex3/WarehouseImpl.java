package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> set = new HashSet<>();

	public void addProduct(Product p) { 
		if(!set.contains(p)) {
			set.add(p);
		}
	}

	public Set<String> allNames() {
		final HashSet<String> setName = new HashSet<>();
		for(Product s : set) {
			setName.add(s.getName());
		}
		return setName;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(set);
	}

	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	public double getQuantity(String name) {
		for (Product p : set) {
			if (name == p.getName()) {
				return p.getQuantity();
			}
		}
		return 0;
	}

}
