package com.badrinathd.learnspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		
		
		//Created Factory container and Assigned Configuration file to it"
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring_config.xml"));
		
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
