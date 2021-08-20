package com.future.spring.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 10:00
 */
@Service
public class PublisherImpl implements Publisher {

    @Autowired
    private List<Observer> observers;

    @Override
    public void notifyUpdate(Message message) {
        System.out.println("更新数据->通知:" + message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
