package com.future.proxy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 14:05
 */
public class Proxy extends RealObjectImpl {
    @Override
    public void doSomething() {
        //这里做一些代理操作或额外的操作
        System.out.println("通过代理类来执行真实对象");
        super.doSomething();
    }
}