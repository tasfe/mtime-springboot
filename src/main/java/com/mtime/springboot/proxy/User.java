package com.mtime.springboot.proxy;

public class User {
	private String id;  
    private String username;  
    private int age;  
    private String remarks;  
  
    public User(String id, String username, int age, String remarks) {  
        super();  
        this.id = id;  
        this.username = username;  
        this.age = age;  
        this.remarks = remarks;  
    }  
       @Override  
       public String toString() {  
           return "User [id=" + id + ", username=" + username + ", age=" + age  
                + ", remarks=" + remarks + "]";  
    }  
}
