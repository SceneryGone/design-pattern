package com.future.spring.observer;

import org.springframework.stereotype.Service;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-20 09:58
 */
@Service
public class ObserverA implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("A观察者监控到消息变化。。。。" + message);
    }
}
