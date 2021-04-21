package com.udemy.barath.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionstest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springcoreadvanced/stereotypeannotations/config.xml");
		Instructor instructor = (Instructor) context.getBean("inst");
		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println("First" + instructor + " hashcode: " + instructor.hashCode());
		System.out.println("Second" + instructor2 + " hashcode: " + instructor2.hashCode());
	}
}
