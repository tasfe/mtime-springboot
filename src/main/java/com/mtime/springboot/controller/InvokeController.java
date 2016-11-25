package com.mtime.springboot.controller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mtime.springboot.support.jrpc.JrpcFramework;
import com.mtime.springboot.support.jrpc.MethodAndArgs;
import com.mtime.springboot.test.jrpc.service.StaffService;
import com.mtime.springboot.test.jrpc.service.StaffServiceImpl;
import com.thoughtworks.xstream.XStream;

@Controller
@RequestMapping("/invoke")
public class InvokeController {
	
	@RequestMapping("/main")
	@ResponseBody
	public Object main(HttpServletRequest request,String mArgs,String iClass){
		try {
			XStream xstream = new XStream();
			MethodAndArgs methodAndArgs=(MethodAndArgs) xstream.fromXML(mArgs);
			Class cls=(Class) xstream.fromXML(iClass);
			//StaffService staffService=new StaffServiceImpl();
			Object service= JrpcFramework.getObj(cls, "127.0.0.1", 1818);
			Method method=cls.getMethod(methodAndArgs.getMethodName(), methodAndArgs.getTypes());
			Object obj=method.invoke(service, methodAndArgs.getObjects());
			return xstream.toXML(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
