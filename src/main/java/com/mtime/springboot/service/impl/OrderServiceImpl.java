package com.mtime.springboot.service.impl;

import org.springframework.stereotype.Component;

import com.mtime.springboot.service.OrderService;
import com.mtime.springboot.support.annotation.SpiderService;

//@Component
@SpiderService(cls=OrderService.class,desc="aaaa")
public class OrderServiceImpl implements OrderService {

	@Override
	public String getOrderMsg(String orderId, String userId) {
		System.out.println("getOrderMsg()orderId:"+orderId);
		return "OMSG.......";
	}

}
