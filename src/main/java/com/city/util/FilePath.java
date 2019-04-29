package com.city.util;

import java.io.File;

public class FilePath {
	/**
	 * 当前的工程下的路径
	 * @return 当前的工程下的路径
	 */
	public static String getProjectPath() {
		return System.getProperty("user.dir").toString() + "\\"+"\\src\\main\\java\\";
	}

	/**
	 * 编译之后src下的文件路径，根据工程路径拼接
	 * @return 编译之后src下的文件路径
	 */
	public static String getSrcPath() {
		return System.getProperty("user.dir").toString() + "\\bin\\";
	}

	/**
	 * 根据反射获取编译之后的src下面的文件路径
	 * @param class1 类
	 * @return 类所在目录
	 */
	public static String getSrcPath(Class<?> class1) {
		String path = class1.getClassLoader().getResource("").toString();
		// System.out.println("编译后src路径："+path);//file:/D:/dev/workspase2Spring/XMLreader/bin/
		int m = path.indexOf("/");// file:/<----点位到file:后面的反斜杠
		path = path.substring(m + 1);// 从反斜杠之后的一位开始截取字符串
		// System.out.println("编译后src路径："+path);
		return path;
	}

	// 根据反射获取编译之后包下面的文件路径
	/**
	 * 根据反射获取编译之后包下面的文件路径
	 * @param class1
	 * @return 根据反射获取编译之后包下面的文件路径
	 */
	public static String getPackagePath(Class<?> class1) {
		// 获取包路径
		String thisPackagePath = class1.getResource("").toString();
//        System.out.println("路径："+thisPackagePath);  
		int m = thisPackagePath.indexOf("/");// 去掉前面的file:
		thisPackagePath = thisPackagePath.substring(m + 1);
//        System.out.println("路径："+thisPackagePath);  
		return thisPackagePath;// 返回当前包返回的路径。
	}

	public static String getProjectPath(Class<?> class1) {
		// 获取src路径
		String path = class1.getClassLoader().getResource("").toString();
		// System.out.println("编译后src路径："+path);//file:/D:/dev/workspase2Spring/XMLreader/bin/
		// 文件定位到src路径
		File file = new File(path);// 定位到这个目录下面
		path = file.getParent();// 返回src路径的父路径，也就是工程路径
//      结果 path=file:\D:\dev\workspase4javaBasis\FilePath
		int m = path.indexOf("\\");// file:\<----点位到file:后面的反斜杠
		path = path.substring(m + 1);// 从反斜杠之后的一位开始截取字符串
		// System.out.println("编译后src路径："+path);
		return path;
	}

	public static void main(String[] args) {
		System.out.println("当前的包路径为：" + FilePath.getPackagePath(FilePath.class));
		System.out.println("当前的工程路径为：" + FilePath.getProjectPath());
		System.out.println("当前的工程路径为：" + FilePath.getPackagePath(FilePath.class));
		System.out.println("编译后的src路径为：" + FilePath.getSrcPath());
		System.out.println("编译后的src路径为：" + FilePath.getSrcPath(FilePath.class));

	}
}
