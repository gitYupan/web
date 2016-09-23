/**
 * 版权所有：恒生电子股份有限公司 保留所有权利
 * 版本： 1.0
 * ******************************************
 * Copyright (c)  by Hundsun ,Ltd.
 * All right reserved.
 * Last version:  1.0
 */
package com.yihou.service;

import io.netty.channel.ChannelFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * author yupan@18551
 * date 2016-09-22 19:01
 */
@Component
public class RemoteCall<T> {

    private Lock lock = new ReentrantLock();

    Map<String, RemoteCallHolder> remoteCallMap = new ConcurrentHashMap<String, RemoteCallHolder>();

    @Autowired
    private SocketCallClient socketCallClient;

    public T remoteCallWithTimeOut(String host, int prot, String postString, long timeout) {

        Condition condition = lock.newCondition();
        final RemoteCallHolder holder = new RemoteCallHolder();
        holder.condition = condition;
        ChannelFuture future = socketCallClient.getChannelFuture(host, prot);
        remoteCallMap.put(String.valueOf(holder.condition), holder);
        lock.lock();
        future.channel().writeAndFlush(postString);
        try {
            if (timeout > 0)
                condition.await(timeout, TimeUnit.MILLISECONDS);
            else
                condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException("调用超时", e);
        } finally {
            lock.unlock();
        }
        return holder.result;

    }

    public void notice(String s) {

    }

    class RemoteCallHolder {
        public long sequence;
        public Condition condition;
        public T result;

        private RemoteCallHolder() {
            sequence = System.nanoTime();
        }
    }

}
