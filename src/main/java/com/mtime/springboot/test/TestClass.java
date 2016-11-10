package com.mtime.springboot.test;

import java.lang.reflect.Field;


public class TestClass {
	public static void main(String argus[]){
		//TestBean ts=null;
		TestBean ts=new TestBean();
		try {
			TestClass.vald(ts, "错误日志", "age","userName","list");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void vald(Object request,String errorMsg,String ...propertys ) throws Exception{
		if(null==request){
			System.out.println(errorMsg);
		}else{
			Class<?> requestClz =request.getClass();
			Field[] fields= requestClz.getFields();
			
			for (Field field : fields) {
				String fieldName=field.getName();
				Class<?> fieldClz=field.getType();
				String fieldType=fieldClz.getSimpleName();
				
				for (String property : propertys) {
					if(property.equals(fieldName)){
						//System.out.println(fieldType);
						Object oValue=field.get(request);
						if(fieldType.equals("long")||fieldType.equals("int")||fieldType.equals("double")){
							if(oValue.toString().equals("0")){
								//System.out.println(errorMsg);
								//System.out.println(oValue);
								System.out.println("0");
							}
						}else{
							if(null==oValue){
								System.out.println("NULL");
							}
						}
						
						break;
					}
				}
				
			}
		}
	}
	
	
	
	private void valdateParams(String eMsg,Object... objs){
		for (Object object : objs) {
			Class<?> clz =object.getClass();
			System.out.println(clz.getName()+"#"+clz.getSimpleName()+""+clz.getTypeName());
			System.out.println(object.toString());
		}
	}
}
