package com.mtime.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mtime.springboot.model.po.MuserPO;
import com.mtime.springboot.service.UserService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/simple")
public class SampleController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
    @ResponseBody
    String home() {
		
		List<MuserPO> ls=this.userService.getUserList();
		for (MuserPO muserPO : ls) {
			System.out.println(">>>"+muserPO.getMobile());
		}
		
        return "Hello World!";
    }

    
}
