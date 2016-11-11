package com.mtime.springboot.test.jrpc;

import com.mtime.springboot.support.jrpc.JrpcFramework;
import com.mtime.springboot.test.jrpc.service.StaffService;
import com.mtime.springboot.test.jrpc.service.StaffServiceImpl;

public class StaffPro {
	public static void main(String argus[]){
		StaffService staffService=new StaffServiceImpl();
		try {
			JrpcFramework.regist(staffService, 1717, "127.0.0.1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
