package com.future.observer.demo2;

/**
 * 功能描述: 被观察者
 *
 * @author future
 * @date 2021-08-20 10:00
 */
public interface Subject {
    void attach(MessageObserver o);  //增加观察者
    void detach(MessageObserver o);  //删除观察者
    void notifyUpdate(Message m);    //更新通知
}
