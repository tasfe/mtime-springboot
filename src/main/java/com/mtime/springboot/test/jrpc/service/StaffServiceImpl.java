package com.mtime.springboot.test.jrpc.service;

public class StaffServiceImpl implements StaffService {

	@Override
	public String getStaffName(String staffId) {
		System.out.println("staffId:"+staffId);
		return "zhangsan";
	}

}
