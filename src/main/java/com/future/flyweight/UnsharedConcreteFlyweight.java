package com.future.flyweight;

/**
 * 功能描述:
 *
 * @author future
 * @date 2021-08-18 13:45
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private String uniqueKey;

    public UnsharedConcreteFlyweight(String key) {
        this.uniqueKey = key;
    }

    @Override
    public void operation(int state) {
        System.out.println("=== 使用不共享的对象，内部状态：" + uniqueKey + "，外部状态：" + state);
    }
}
