package com.mtime.springboot.service;

import java.util.List;

import com.mtime.springboot.model.po.MuserPO;

public interface UserService {
	
	public List<MuserPO> getUserList();
}
