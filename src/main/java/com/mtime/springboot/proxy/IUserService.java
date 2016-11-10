package com.mtime.springboot.proxy;

public interface IUserService {
	public void add(User user);  
    
    public User query();  
      
    public void delete(int id);  
}
