package com.udemy.barath.spring.springcoreadvanced.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class assignmentTest {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springcoreadvanced/assignment/assignmentconfig.xml");
		Reservation reservation = (Reservation) context.getBean("reservation");
		System.out.println(reservation);
	}
}
