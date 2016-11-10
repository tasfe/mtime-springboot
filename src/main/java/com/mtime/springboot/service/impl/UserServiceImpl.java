package com.mtime.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtime.springboot.model.po.MuserPO;
import com.mtime.springboot.model.po.MuserPOExample;
import com.mtime.springboot.service.UserService;
import com.mtime.springboot.support.dao.CommDAO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private CommDAO commDAO;
	
	@Override
	public List<MuserPO> getUserList() {
		MuserPOExample example=new MuserPOExample();
		List<MuserPO> ls=this.commDAO.initDAO().selectByExample(example);
		return ls;
	}

}
