package com.mtime.springboot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodProxy  implements InvocationHandler{
	 @Override  
	    public Object invoke(Object proxy, Method method, Object[] args)  
	            throws Throwable {  
	        System.out.println("执行前");  
	        if (Object.class.equals(method.getDeclaringClass())) {  
	            try {  
	                return method.invoke(this, args);  
	            } catch (Throwable t) {  
	                t.printStackTrace();  
	            }  
	        } else {  
	        	System.out.println("调用方法名："+method.getName());  
	            return run(method, args);  
	        }  
	        System.out.println("执行后");  
	        return null;  
	    }  
	      
	    UserDao dao = null;  
	    //具体实现通过方法名绑定。  
	    public Object run(Method method,Object[] args){  
	        if(dao == null){  
	            dao = new UserDao();  
	        }  
	        Object ret = null;  
	        String name = method.getName();  
	        if(name.equals("add")){  
	            dao.add(args);  
	        }else if(name.equals("delete")){  
	            dao.delete();  
	        }else if(name.equals("query")){  
	            ret = dao.query();  
	        }  
	        return ret;  
	    }  
	      
	    class UserDao {  
	        public void add(Object[] args){  
	            System.out.println("dao add");  
	            for (Object object : args) {  
	                System.out.print(object+",");  
	            }  
	        }  
	        public void delete(){  
	            System.out.println("dao delete");  
	        }  
	        public User query(){  
	            return new User("123", "济南", 22, "备注");  
	        }  
	    }  
}
