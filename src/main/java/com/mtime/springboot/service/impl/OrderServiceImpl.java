package com.mtime.springboot.service.impl;

import com.mtime.springboot.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public String getOrderMsg(String orderId, String userId) {
		System.out.println("getOrderMsg()orderId:"+orderId);
		return "OMSG.......";
	}

}
