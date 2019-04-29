package com.city.chapter12Composite;

import java.util.ArrayList;
import java.util.List;

//public abstract class Component {
//	public abstract void add(Component c);
//
//	public abstract void remove(Component c);
//
//	public abstract Component getChild(int i);
//
//	public abstract void operation();
//}
//
//public class Leaf extends Component {
//	public void add(Component c) {
//	}
//
//	public void remove(Component c) {
//	}
//
//	public Component getChild(int i) {
//	}
//
//	public void operation() {
//		// 实现代码
//	}
//}
//
//public class Composite extends Component {
//	private List list = new ArrayList();
//
//	public void add(Component c) {
//		list.add(c);
//	}
//
//	public void remove(Component c) {
//		list.remove(c);
//	}
//
//	public Component getChild(int i)
//	{
//		(Component)list.get(i);
//	}
//
//	public void operation() {
//		for (Object obj : list) {
//			((Component) obj).operation();
//		}
//	}
//}
