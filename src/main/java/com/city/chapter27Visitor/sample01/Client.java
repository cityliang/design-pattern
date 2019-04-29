package com.city.chapter27Visitor.sample01;

import com.city.util.FilePath;

public class Client {
	public static void main(String a[]) {
		Product b1 = new Book();
		Product b2 = new Book();
		Product a1 = new Apple();
		Visitor visitor;

		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径 
		String xmlPath = FilePath.getPackagePath(Client.class);
		System.out.println("1: "+xmlPath);
		xmlPath = xmlPath.replace("/target/classes/", "/src/main/java/");
		System.out.println("2: "+xmlPath);
		visitor = (Visitor) XMLUtil.getBean();

		visitor.setName("张三");

		basket.accept(visitor);
	}
}
