package com.mtime.springboot.test.http;

import com.mtime.springboot.model.po.MuserPO;
import com.thoughtworks.xstream.XStream;

public class XStreamTest {
	
	public static  void main(String argus[]){
		XStream xstream = new XStream();
		MuserPO muserPO=new MuserPO();
		muserPO.setNickName("<zhangsan>");
		muserPO.setMobile("1588838383");
		
		
		String xstr=xstream.toXML(muserPO);
		System.out.println(xstr);
		
		System.out.println(xstream.toXML(MuserPO.class));
		
		//System.out.println(xstream.toXML(cls);
		
		Object obj=xstream.fromXML(xstr);
		System.out.println(obj);
		
	}
	
}
