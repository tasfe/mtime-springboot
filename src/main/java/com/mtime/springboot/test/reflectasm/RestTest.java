package com.mtime.springboot.test.reflectasm;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;
import com.mtime.springboot.model.po.MuserPO;
import com.mtime.springboot.service.OrderService;
import com.mtime.springboot.service.impl.OrderServiceImpl;

public class RestTest {
	public static void main(String argus[]){
		{
			//ReflectASM 反射调用方法:
			MuserPO muserPO = new  MuserPO();
			MethodAccess access = MethodAccess.get(MuserPO.class);
			access.invoke(muserPO, "setMobile", "13876767676");
			String mobile = (String)access.invoke(muserPO, "getMobile");
			System.out.println(mobile);
		}
		{	//用 ReflectASM 反射来 set/get 字段值:
			MuserPO muserPO = new  MuserPO();
			FieldAccess access = FieldAccess.get(MuserPO.class);
			access.set(muserPO, "mobile", "12345678909");
			String mobile = (String)access.get(muserPO, "mobile");
			System.out.println(mobile);
		}
		
		{
			//用 ReflectASM 反射来调用构造方法:
			ConstructorAccess<OrderServiceImpl> access = ConstructorAccess.get(OrderServiceImpl.class);
			OrderService orderService = access.newInstance();
			System.out.println(orderService.getOrderMsg("1111", "22222"));
		}
		
		{	//避免用方法名来查找
			MuserPO muserPO = new  MuserPO();
			MethodAccess access = MethodAccess.get(MuserPO.class);
			int addNameIndex = access.getIndex("setMobile");
			//for (String name : names)
			access.invoke(muserPO, addNameIndex, "Awesome McLovin");
			
			String mobile = (String)access.invoke(muserPO, "getMobile");
			System.out.println(mobile);
		}
		
		
	}
}
