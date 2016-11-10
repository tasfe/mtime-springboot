package com.mtime.springboot.proxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String argus[]){
		 MethodProxy invocationHandler = new MethodProxy();  
		 
	     Object newProxyInstance = Proxy.newProxyInstance(  
	                IUserService.class.getClassLoader(),  
	                new Class[] { IUserService.class }, 
	                invocationHandler);  
	     
        IUserService userService = (IUserService) newProxyInstance;  
        User query = userService.query();  
        System.out.println("query result->" + query.toString());  
	}  
}
