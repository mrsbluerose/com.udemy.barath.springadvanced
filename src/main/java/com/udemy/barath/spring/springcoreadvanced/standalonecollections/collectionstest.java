package com.udemy.barath.spring.springcoreadvanced.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionstest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springcoreadvanced/standalonecollections/config.xml");
		ProductsList pl = (ProductsList) context.getBean("productsList");
		System.out.println(pl);
	}
}
