package com.mtime.springboot.test;

import java.util.Date;

public class Single {
	public static final Single INSTANCE=new Single();
	private final static Date id; 
	
	
	static{
		id=new Date();
		System.out.println("static init...");
	}
	public Single(){
		System.out.println("pojo init...");
	}
	
	public String getName(){
		System.out.println("name"+id);
		return "name";
	}
}
