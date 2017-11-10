package com.pusp.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
		HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);
		System.out.println(helloWorld.sayHello());

	}

}
