package com.future.proxy;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 14:06
 */
public class Client {

    public static void main(String[] args) {
        RealObject realObjectProxy = new Proxy();
        realObjectProxy.doSomething();
    }

}
