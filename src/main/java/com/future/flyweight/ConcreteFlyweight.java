package com.future.flyweight;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 11:52
 */
public class ConcreteFlyweight implements Flyweight {

    private String uniqueKey;

    public ConcreteFlyweight(String key) {
        this.uniqueKey = key;
    }

    @Override
    public void operation(int state) {
        System.out.printf("=== 享元内部状态：%s,外部状态：%s%n", uniqueKey, state);
    }

}
