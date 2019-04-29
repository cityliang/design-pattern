package com.city.chapter23Observer.sample02;

import java.util.EventListener;

public interface LoginEventListener extends EventListener {
	public void validateLogin(LoginEvent event);

}
