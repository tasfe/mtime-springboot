package com.mtime.springboot.support.zookeeper;

import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

public class ZkClientTest {
	
	public static void main(String argus[]) throws Exception{
		//zk集群的地址  
        String zKServers = "127.0.0.1:2181";  
      
        /** 
         * 创建会话 
         * new SerializableSerializer() 创建序列化器接口，用来序列化和反序列化 
         */  
        ZkClient zkClient = new ZkClient(zKServers,10000,10000,new SerializableSerializer());  
        
        zkClient.subscribeChildChanges("/service", new IZkChildListener(){
            public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception{
                System.out.println(parentPath + " 's child changed, currentChilds:" + currentChilds);
            }
        });
        //zkClient.delete("/service/com.nebula.spider.test.service.OrderService/providers",-1);
        
        //zkClient.createEphemeral("/service/com.nebula.spider.test.service.OrderService");
        //zkClient.createEphemeral("/zktest/node1");
        Thread.sleep( 1000000 );
        //System.out.println(zkClient.getChildren(path));
        
        System.out.println("conneted ok!");  
	}
}
