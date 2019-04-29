package com.city.chapter27Visitor.sample01;

public class Book implements Product {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
