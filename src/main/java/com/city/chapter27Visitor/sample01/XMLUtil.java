package com.city.chapter27Visitor.sample01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.city.util.FilePath;

public class XMLUtil {
	private static String xmlPath = FilePath.getPackagePath(XMLUtil.class);
	private static String classPath = FilePath.getPackagePath(XMLUtil.class);
	// 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean() {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			System.out.println(xmlPath);
			doc = builder.parse(new File(xmlPath+"config.xml"));

			// 获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			xmlPath = xmlPath.replace("/target/classes/", "/src/main/java/");
			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
