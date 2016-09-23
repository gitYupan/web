/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.service;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 * author yupan@18551
 * date 2016-09-22 17:20
 */
@Component
public class SocketCallClient implements InitializingBean, DisposableBean {

    private Bootstrap b;
    private EventLoopGroup clientGroup;

    private Map<String, ChannelFuture> futureMap = new ConcurrentHashMap<String, ChannelFuture>();

    @Autowired
    private SocketClientHandler socketClientHandler;

    public void afterPropertiesSet() throws Exception {
        b = new Bootstrap();
        clientGroup = new NioEventLoopGroup();
        b.group(clientGroup);
        b.channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(socketClientHandler);
    }

    public void destroy() throws Exception {
        if (clientGroup != null) {
            clientGroup.shutdownGracefully();
        }
    }

    /**
     * 获取netty ChannelFuture
     *
     * @param host 主机ip
     * @param port 端口号
     * @return ChannelFuture
     */
    public ChannelFuture getChannelFuture(String host, int port) {
        if (!futureMap.containsKey(host)) {
            return newChannelFuture(host, port);
        }
        ChannelFuture future = futureMap.get(host);
        if (future.channel().isActive()) {
            return future;
        } else {
            future.channel().closeFuture();
            return newChannelFuture(host, port);
        }
    }

    private synchronized ChannelFuture newChannelFuture(String host, int port) {
        ChannelFuture f = b.connect(host, port);
        try {
            f.await(30);
            if (!f.channel().isActive()) {
                throw new RuntimeException("地址不通！");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("地址不通！", e);
        }
        futureMap.put(host, f);
        return f;
    }

}
