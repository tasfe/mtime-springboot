package com.mtime.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mtime.springboot.BootApp;
import com.mtime.springboot.model.po.MuserPO;
import com.mtime.springboot.service.UserService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = BootApp.class)
//@WebAppConfiguration
public class MuserServiceTest extends AbstractTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserList(){
		List<MuserPO> list=this.userService.getUserList();
		for (MuserPO muserPO : list) {
			System.out.println(muserPO.getMobile());
		}
	}
	
	
}
