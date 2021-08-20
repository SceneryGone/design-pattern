package com.future.observer.demo2;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:00
 */
public class SubjectPublisherImpl implements Subject {

    private final List<MessageObserver> observers = Lists.newArrayList();

    @Override
    public void attach(MessageObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(MessageObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message message) {
        System.out.println("更新数据->通知:" +message );
        for (MessageObserver observer : observers) {
            observer.update(message);
        }
    }
}
