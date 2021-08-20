package com.future.observer.demo2;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:12
 */
public class MessageObserverImpl implements MessageObserver {

    @Override
    public void update(Message message) {
        System.out.println("监控到消息");
    }
}
