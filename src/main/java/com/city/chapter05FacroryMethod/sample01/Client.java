package com.city.chapter05FacroryMethod.sample01;

public class Client {
	public static void main(String args[]) {
		try {
			TV tv;
			TVFactory factory;
			factory = (TVFactory) XMLUtil.getBean();
			tv = factory.produceTV();
			tv.play();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		Class<?> c;
//		try {
//			c = Class.forName("Client");
//			Object obj = c.newInstance();
//			System.out.println(obj.getClass().getName());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
