package com.udemy.barath.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside order impl 2 create order");

	}

}
