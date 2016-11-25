package com.mtime.springboot.test.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {
	public static void main(String argus[]){
		Runnable task=null;
		ScheduledExecutorService executor= Executors.newScheduledThreadPool(2);
		executor.schedule(task, 100l, TimeUnit.MILLISECONDS);
		
	}
}
