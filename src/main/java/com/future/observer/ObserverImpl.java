package com.future.observer;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-19 19:08
 */
public class ObserverImpl implements Observer {

    @Override
    public void notify(String acct, double amt) {
        System.out.println("=== 接收到通知：账户：" + acct + " 账单：" + amt);
    }
    
}
