package com.city.chapter27Visitor.sample01;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
	private ArrayList<Product> list = new ArrayList<>();

	public void accept(Visitor visitor) {
		Iterator<Product> i = list.iterator();

		while (i.hasNext()) {
			((Product) i.next()).accept(visitor);
		}
	}

	public void addProduct(Product product) {
		list.add(product);
	}

	public void removeProduct(Product product) {
		list.remove(product);
	}
}
