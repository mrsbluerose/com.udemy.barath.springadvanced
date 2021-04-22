package com.udemy.barath.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside order dao createorder()");
	}

}
