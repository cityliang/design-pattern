package com.city.chapter23Observer.sample02;

import java.util.EventObject;

public class LoginEvent extends EventObject {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	public LoginEvent(Object source, String userName, String password) {
		super(source);
		this.userName = userName;
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

}
