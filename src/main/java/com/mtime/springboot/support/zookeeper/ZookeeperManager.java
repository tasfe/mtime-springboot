package com.mtime.springboot.support.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;

public final class ZookeeperManager {
	 private static  ZooKeeper zooKeeper;
	 
	 static {
		 try {
			 zooKeeper= new ZooKeeper("127.0.0.1:2181", 
		        3000, new Watcher() { 
		            // 监控所有被触发的事件
					public void process(WatchedEvent event) {
						System.out.println("已经触发了" + event.getType() + "事件！"); 
					} 
				  });
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 public static String create(String path,byte[] data){
		 
		 try {
			 
			return zooKeeper.create(path, data, Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 return null;
	 }
}
