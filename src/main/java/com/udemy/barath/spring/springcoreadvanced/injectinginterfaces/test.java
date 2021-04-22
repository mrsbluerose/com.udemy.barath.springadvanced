package com.udemy.barath.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springcoreadvanced/injectinginterfaces/config2.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();
	}

}
