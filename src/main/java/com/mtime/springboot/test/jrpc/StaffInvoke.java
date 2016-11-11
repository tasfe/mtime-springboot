package com.mtime.springboot.test.jrpc;

import com.mtime.springboot.support.jrpc.JrpcFramework;
import com.mtime.springboot.test.jrpc.service.StaffService;

public class StaffInvoke {
	public static void main(String argus[]){
		StaffService staffService=JrpcFramework.getObj(StaffService.class, "127.0.0.1", 1717);
		System.out.println(staffService.getStaffName("1001"));
	}
}
