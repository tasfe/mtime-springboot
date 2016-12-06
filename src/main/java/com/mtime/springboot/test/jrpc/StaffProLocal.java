package com.mtime.springboot.test.jrpc;

import com.mtime.springboot.support.jrpc.JrpcFramework;
import com.mtime.springboot.test.jrpc.service.StaffService;
import com.mtime.springboot.test.jrpc.service.StaffServiceImpl;

public class StaffProLocal {
	public static void main(String argus[]){
		StaffService staffService=new StaffServiceImpl();
		try {
			JrpcFramework.registLocal(staffService, 1717, "127.0.0.1");//注册本地RPC服务
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
