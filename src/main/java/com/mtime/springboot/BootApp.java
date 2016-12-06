package com.mtime.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mtime.springboot.service.OrderService;
import com.mtime.springboot.support.annotation.SpiderService;


@SpringBootApplication
public class BootApp {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= SpringApplication.run(BootApp.class, args);
		System.out.println(ctx.getBeansWithAnnotation(SpiderService.class));
	
		//System.out.println(ctx.getBean(OrderService.class));
		//SpringApplication.run(Bootstrap.class, args);
    }
}
