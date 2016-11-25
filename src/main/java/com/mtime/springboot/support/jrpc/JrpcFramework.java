package com.mtime.springboot.support.jrpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mtime.springboot.support.http.HttpClientUtil;
import com.thoughtworks.xstream.XStream;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
/**
 * netty rpc 注册调用服务
* @Description: TODO
* @author hui.zhang-1@mtime.com
* @date 2016年11月11日 下午5:48:39
 */
public class JrpcFramework {
	private static Logger logger =LoggerFactory.getLogger(JrpcFramework.class);
	
	/**
	 * 注册服务
	 * @param <T>
	 * @param serviceObj
	 * @param port
	 * @param ip
	 * @throws InterruptedException
	 */
	public static <T> void regist(final T serviceObj,int port,String ip) throws InterruptedException {
		logger.info(">>>JrpcFramework.regist()");
		
		ServerBootstrap bootstrap = new ServerBootstrap();
		EventLoopGroup boss = new NioEventLoopGroup();
		EventLoopGroup worker = new NioEventLoopGroup();
		bootstrap.group(boss, worker);
		bootstrap.channel(NioServerSocketChannel.class);
		bootstrap.childHandler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(Channel ch) throws Exception {
            	ChannelPipeline pipeline = ch.pipeline();
        		pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
                pipeline.addLast(new LengthFieldPrepender(4));
                pipeline.addLast("encoder", new ObjectEncoder());  
                pipeline.addLast("decoder", new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));
                pipeline.addLast(new TcpServerHandler(serviceObj));
            }       
        });
		ChannelFuture future = bootstrap.bind(port).sync();
		if (future.isSuccess()) {
			logger.info(">>>启动Netty服务成功。ip->{} port->{}",ip,port);
		}
		// 关闭连接
		future.channel().closeFuture().sync();
		boss.shutdownGracefully();
		worker.shutdownGracefully();
		logger.info("<<<JrpcFramework.regist()");
	}
	
	
	/**
	 * 注册服务
	 * @param serviceObj
	 * @param port
	 * @param ip
	 * @throws InterruptedException
	 */
	public static void registLocal(final Object serviceObj,int port,String ip) throws InterruptedException {
		logger.info(">>>JrpcFramework.registLocal()");
		
		ServerBootstrap bootstrap = new ServerBootstrap();
		EventLoopGroup boss = new NioEventLoopGroup();
		EventLoopGroup worker = new NioEventLoopGroup();
		bootstrap.group(boss, worker);
		bootstrap.channel(NioServerSocketChannel.class);
		bootstrap.childHandler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(Channel ch) throws Exception {
            	ChannelPipeline pipeline = ch.pipeline();
        		pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
                pipeline.addLast(new LengthFieldPrepender(4));
                pipeline.addLast("encoder", new ObjectEncoder());  
                pipeline.addLast("decoder", new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));
                pipeline.addLast(new TcpServerHandlerLocal(serviceObj));
            }       
        });
		ChannelFuture future = bootstrap.bind(port).sync();
		if (future.isSuccess()) {
			logger.info(">>>启动Netty服务成功。ip->{} port->{}",ip,port);
		}
		// 关闭连接
		future.channel().closeFuture().sync();
		boss.shutdownGracefully();
		worker.shutdownGracefully();
		logger.info("<<<JrpcFramework.registLocal()");
	}
	
	
	/**
	 * 取得实例 
	 * @param interfaceClass
	 * @param host
	 * @param port
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T>T getObj(Class<T> interfaceClass,final String host,final int port) {
		
		return (T)	Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				MethodAndArgs mArgs=new MethodAndArgs(method.getName(), method.getParameterTypes(), args);
				
				//http的实现
				/**
				 * 1.发送http请求 传送 mArgs 
				 * 
				 */
				
				//-->netty 的 tcp方式实现
				final TcpClientHander tcpClientHander=new TcpClientHander();
				EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
				try {
					Bootstrap bootstrap = new Bootstrap();
					bootstrap.group(eventLoopGroup);
					bootstrap.channel(NioSocketChannel.class);
					//bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
					//bootstrap.remoteAddress(host, port);
					bootstrap.handler(new ChannelInitializer<SocketChannel>() {
						@Override
						protected void initChannel(SocketChannel ch)throws Exception {
							ChannelPipeline pipeline = ch.pipeline();
							pipeline.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 0, 4, 0, 4));
				            pipeline.addLast(new LengthFieldPrepender(4));
				            pipeline.addLast("encoder", new ObjectEncoder());  
				            pipeline.addLast("decoder", new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null)));
							pipeline.addLast(tcpClientHander);
						}
					});
					ChannelFuture future = bootstrap.connect(host, port).sync();
					if (future.isSuccess()) {
						logger.info(">>>链接netty服务成功");
					}
					
					future.channel().writeAndFlush(mArgs).sync();//传送数据
					future.channel().closeFuture().sync();
				} finally {
					eventLoopGroup.shutdownGracefully();
				}
				return tcpClientHander.getServiceObj();
				//-->//netty的 tcp方式实现
				
			}
		});
	}
}

/**
 *服务端处理类
* @Description: TODO
* @author hui.zhang-1@mtime.com
 * @param <T>
* @date 2016年11月11日 下午5:09:25
 */
class TcpServerHandler<T>  extends ChannelInboundHandlerAdapter{
	private static Logger logger = LoggerFactory.getLogger(TcpServerHandler.class);
	private T serviceObj;
	public TcpServerHandler(T serviceObj){
		this.serviceObj=serviceObj;
	}
	public void channelRead(ChannelHandlerContext ctx, MethodAndArgs msg) throws Exception {
		logger.info(">>>TcpServerHandler.channelRead()");
		
		MethodAndArgs methodAndArgs=(MethodAndArgs) msg;
		
		/**
		Method method=serviceObj.getClass().getMethod(methodAndArgs.getMethodName(), methodAndArgs.getTypes());
		ctx.writeAndFlush(method.invoke(serviceObj, methodAndArgs.getObjects()));
        ctx.close();
        **/
		//System.out.println(">>>>>>>>>>>>>>>>>>>"+methodAndArgs.getMethodName());
		XStream xstream = new XStream();
		Map<String,String> map=new HashMap<>();
		map.put("mArgs", xstream.toXML(methodAndArgs));
		map.put("iClass", xstream.toXML(serviceObj.getClass().getInterfaces()[0]));
		Object obj=HttpClientUtil.doPost("http://127.0.0.1:8081/invoke/main", map, "utf-8");
		ctx.writeAndFlush(obj);
        ctx.close();
        
        logger.info("<<<TcpServerHandler.channelRead()");
	}
}



class TcpServerHandlerLocal extends ChannelInboundHandlerAdapter{
	private static Logger logger = LoggerFactory.getLogger(TcpServerHandler.class);
	private Object serviceObj;
	public TcpServerHandlerLocal(Object serviceObj){
		this.serviceObj=serviceObj;
	}
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		logger.info(">>>TcpServerHandler.channelRead()");
		
		MethodAndArgs methodAndArgs=(MethodAndArgs) msg;
		
		
		Method method=serviceObj.getClass().getMethod(methodAndArgs.getMethodName(), methodAndArgs.getTypes());
		ctx.writeAndFlush(method.invoke(serviceObj, methodAndArgs.getObjects()));
        ctx.close();
       
        
        logger.info("<<<TcpServerHandler.channelRead()");
	}
}

/**
 * 客户端处理类
* @Description: TODO
* @author hui.zhang-1@mtime.com
* @date 2016年11月11日 下午5:16:54
 */
class TcpClientHander extends ChannelInboundHandlerAdapter{
	private static Logger logger = LoggerFactory.getLogger(TcpClientHander.class);
	
	private Object serviceObj;
	public Object getServiceObj() {
		return serviceObj;
	}
	//发送数据
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		logger.info(">>>TcpServerHandler.channelRead()");

		logger.info("<<<TcpServerHandler.channelRead()");
	}
	
	//接收数据
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		logger.info(">>>TcpServerHandler.channelRead()");
		
		this.serviceObj=msg;
		
		logger.info("<<<TcpServerHandler.channelRead()");
	}
	
}
