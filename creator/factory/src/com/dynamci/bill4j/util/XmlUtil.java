package com.dynamci.bill4j.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
public class XmlUtil {
    /**
     * 该方法用于从XML配置文件中提取Bean 的全路径名字，并返回一个这个Bean的实例
     */
    public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("Bean");
            Node classNode = nl.item(0).getFirstChild();

            //通过反射创建对象
            Class className = Class.forName(classNode.getNodeValue().trim());
            Object object = className.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
