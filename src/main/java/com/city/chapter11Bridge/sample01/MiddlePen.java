package com.city.chapter11Bridge.sample01;

public class MiddlePen extends Pen {
	public void draw(String name) {
		String penType = "中号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
