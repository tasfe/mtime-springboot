package com.mtime.springboot.test.netty;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
public class NettyClientHandler extends ChannelInboundHandlerAdapter   {
	private  ByteBuf firstMessage;
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println(">>>channelActive()");
		
		byte[] data = "服务器，给我一个APPLE".getBytes();
		firstMessage=Unpooled.buffer();
		firstMessage.writeBytes(data);
		ctx.writeAndFlush(firstMessage);
	}
	
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		System.out.println(">>>channelRead()");
		
		ByteBuf buf = (ByteBuf) msg;
		String rev = getMessage(buf);
		System.out.println("客户端收到服务器数据:" + rev);
	}
	
	private String getMessage(ByteBuf buf) {
		System.out.println(">>>getMessage()");
		
		byte[] con = new byte[buf.readableBytes()];
		buf.readBytes(con);
		try {
			return new String(con, Constant.UTF8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
}