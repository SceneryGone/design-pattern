package com.future.spring.observer;

/**
 * 功能描述: 被观察者
 *
 * @author future
 * @date 2021-08-20 10:00
 */
public interface Publisher {
    void notifyUpdate(Message m);    //更新通知
}
