package com.future.proxy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 14:04
 */
public class RealObjectImpl implements RealObject {
    @Override
    public void doSomething() {
        System.out.println("被代理对象输出!");
    }
}
